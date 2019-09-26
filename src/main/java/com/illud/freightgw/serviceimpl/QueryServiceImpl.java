package com.illud.freightgw.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;


import static org.elasticsearch.index.query.QueryBuilders.*;

import java.util.List;

import javax.validation.Valid;

import com.illud.freightgw.client.freight.api.QueryResourceApi;
import com.illud.freightgw.client.freight.model.*;
import com.illud.freightgw.service.QueryService;

import io.searchbox.client.JestClient;

@Service
@Transactional
public class QueryServiceImpl implements QueryService{
	
private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);
	
	private final JestClient jestClient;
	private final JestElasticsearchTemplate esTemplate;
	
	@Autowired 
	QueryResourceApi queryResourceApi;
	
	public QueryServiceImpl(JestClient jestClient,JestElasticsearchTemplate esTemplate) {
		this.jestClient=jestClient;
		this.esTemplate=esTemplate;
	}

	@Override
	public Company getOneCompany(String iDPCode) {
		log.debug("<<<<<< getOne>>>>",iDPCode);
		StringQuery sq = new StringQuery(termQuery("companyIdpCode.keyword", iDPCode).toString());
		return   esTemplate.queryForObject(sq, Company.class);
	}
	@Override
	public Customer getOneCustomer(String iDPCode) {
		log.debug("<<<<<< getOne customer >>>>",iDPCode);
		StringQuery sq = new StringQuery(termQuery("customerIdpCode.keyword", iDPCode).toString());
		return esTemplate.queryForObject(sq, Customer.class);
	}

	@Override
	public Driver getOneDriver(String iDPCode) {
		log.debug("<<<<<< getOne driver>>>>",iDPCode);
		StringQuery sq =new StringQuery(termQuery("driverIdpCode.keyword",iDPCode).toString());
		return esTemplate.queryForObject(sq, Driver.class);
	}
	
	@Override
	public Page<Vehicle> findAllVehiclesByCompanyIdpCode(String iDPCode,Pageable page) {
		log.debug("<<<<<< getOne driver>>>>",iDPCode);
		SearchQuery searchQuery= new NativeSearchQueryBuilder().withQuery(termQuery("company.companyIdpCode.keyword", iDPCode)).build();
		return esTemplate.queryForPage(searchQuery, Vehicle.class);
	}


	@Override
	public Page<Freight> findAllFreightsByRequestedStatus(RequestStatus requestedStatus, Pageable pageable) {
		log.debug("<<<<<< input a requeststatus to get AllFreights>>>>>>",requestedStatus,pageable);
		SearchQuery sq =new NativeSearchQueryBuilder().withQuery(termQuery("freight.requestedStatus.keyword",requestedStatus)).build();
		return esTemplate.queryForPage(sq, Freight.class);
	}
		@Override
	public ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
			String minimumPriority, String maximumPriority, String assignee, String assigneeLike, String owner,
			String ownerLike, String unassigned, String delegationState, String candidateUser, String candidateGroup,
			String candidateGroups, String involvedUser, String taskDefinitionKey, String taskDefinitionKeyLike,
			String processInstanceId, String processInstanceBusinessKey, String processInstanceBusinessKeyLike,
			@Valid String processDefinitionId, @Valid String processDefinitionKey,
			@Valid String processDefinitionKeyLike, @Valid String processDefinitionName,
			@Valid String processDefinitionNameLike, @Valid String executionId, @Valid String createdOn,
			@Valid String createdBefore, @Valid String createdAfter, @Valid String dueOn, @Valid String dueBefore,
			@Valid String dueAfter, @Valid Boolean withoutDueDate, @Valid Boolean excludeSubTasks,
			@Valid Boolean active, @Valid Boolean includeTaskLocalVariables, @Valid Boolean includeProcessVariables,
			@Valid String tenantId, @Valid String tenantIdLike, @Valid Boolean withoutTenantId,
			@Valid String candidateOrAssigned, @Valid String category) {
		
		return queryResourceApi.getTasksUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups, candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState, description, dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables, includeTaskLocalVariables, involvedUser, maximumPriority, minimumPriority, name, nameLike, owner, ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey, processInstanceBusinessKeyLike, processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId, tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	}

	@Override
	public ResponseEntity<List<FreightDTO>> getPendingFreights(String name, String nameLike, String assignee, String assigneeLike,
			String candidateUser, String candidateGroup, String candidateGroups, String processInstanceId,
			@Valid String processDefinitionId, @Valid String processDefinitionKey, @Valid String createdOn,
			@Valid String createdBefore, @Valid String createdAfter) {
		
		return queryResourceApi.getPendingFreightsUsingGET(assignee, assigneeLike, candidateGroup, candidateGroups, candidateUser, createdAfter, createdBefore, createdOn, name, nameLike, processDefinitionId, processDefinitionKey, processInstanceId);
	}

	@Override
	public ResponseEntity<FreightDTO> getBookingDetails(String processInstanceId) {
		
		return queryResourceApi.getBookingDetailsUsingGET(processInstanceId);
	}	
}
