package com.illud.freightgw.serviceimpl;

import org.elasticsearch.index.query.QueryBuilders;
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

import com.illud.freightgw.client.freight.api.CompanyResourceApi;
import com.illud.freightgw.client.freight.api.CustomerResourceApi;
import com.illud.freightgw.client.freight.api.DriverResourceApi;
import com.illud.freightgw.client.freight.api.FreightResourceApi;
import com.illud.freightgw.client.freight.api.QueryResourceApi;
import com.illud.freightgw.client.freight.api.QuotationResourceApi;
import com.illud.freightgw.client.freight.api.VehicleLookUpResourceApi;
import com.illud.freightgw.client.freight.api.VehicleResourceApi;
import com.illud.freightgw.client.freight.model.*;
import com.illud.freightgw.service.QueryService;

import io.searchbox.client.JestClient;

@Service
@Transactional
public class QueryServiceImpl implements QueryService {

	private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);

	private final JestClient jestClient;
	private final JestElasticsearchTemplate esTemplate;

	@Autowired
	QuotationResourceApi quotationResourceApi;

	@Autowired
	QueryResourceApi queryResourceApi;

	@Autowired
	FreightResourceApi freightResourceApi;

	@Autowired
	VehicleResourceApi vehicleResourceApi;

	@Autowired
	DriverResourceApi driverResourceApi;

	@Autowired
	CompanyResourceApi comResourceApi;

	@Autowired
	CustomerResourceApi cusResourceApi;

	@Autowired
	VehicleLookUpResourceApi vehLookupReourceApi;

	public QueryServiceImpl(JestClient jestClient, JestElasticsearchTemplate esTemplate) {
		this.jestClient = jestClient;
		this.esTemplate = esTemplate;
	}

	@Override
	public ResponseEntity<FreightDTO> findFreightId(Long id) {
		log.debug("<<<<<< input a Id to get a freight>>" + id + ">>>>");
		StringQuery sq = new StringQuery(termQuery("id", id).toString());
		return freightResourceApi.createFreightDTOUsingPOST((esTemplate.queryForObject(sq, Freight.class)));

	}

	@Override
	public ResponseEntity<CompanyDTO> findCompanyById(Long id) {
		log.debug("<<<<<< getOne Company by id>>>>", id);
		StringQuery sq = new StringQuery(termQuery("id", id).toString());
		return comResourceApi.createDtoUsingPOST(esTemplate.queryForObject(sq, Company.class));
	}

	@Override
	public ResponseEntity<CustomerDTO> findCustomerById(Long id) {
		log.debug("<<<<<< getOne customer by id >>>>", id);
		StringQuery sq = new StringQuery(termQuery("id", id).toString());
		return cusResourceApi.createDtoUsingPOST1(esTemplate.queryForObject(sq, Customer.class));
	}

	@Override
	public ResponseEntity<DriverDTO> findDriverById(Long id) {
		log.debug("<<<<<< getOne driver by id>>>>", id);
		StringQuery sq = new StringQuery(termQuery("id", id).toString());
		return driverResourceApi.createDtoUsingPOST2(esTemplate.queryForObject(sq, Driver.class));
	}

	@Override
	public ResponseEntity<VehicleLookUpDTO> findVehicleLookUpById(Long id) {
		log.debug("<<<<< get vehiclelook up id in impl>>>>>>", id);
		StringQuery sq = new StringQuery(termQuery("id", id).toString());
		return vehLookupReourceApi.createDtoUsingPOST3(esTemplate.queryForObject(sq, VehicleLookUp.class));
	}

	@Override
	public ResponseEntity<CompanyDTO> getOneCompany(String iDPCode) {
		log.debug("<<<<<< getOne>>>>", iDPCode);
		StringQuery sq = new StringQuery(termQuery("companyIdpCode.keyword", iDPCode).toString());
		return comResourceApi.createDtoUsingPOST(esTemplate.queryForObject(sq, Company.class));
	}

	@Override
	public ResponseEntity<CustomerDTO> getOneCustomer(String iDPCode) {
		log.debug("<<<<<< getOne customer >>>>", iDPCode);
		StringQuery sq = new StringQuery(termQuery("customerIdpCode.keyword", iDPCode).toString());
		return cusResourceApi.createDtoUsingPOST1(esTemplate.queryForObject(sq, Customer.class));
	}

	@Override
	public ResponseEntity<DriverDTO> getOneDriver(String iDPCode) {
		log.debug("<<<<<< getOne driver>>>>", iDPCode);
		StringQuery sq = new StringQuery(termQuery("driverIdpCode.keyword", iDPCode).toString());
		return driverResourceApi.createDtoUsingPOST2(esTemplate.queryForObject(sq, Driver.class));
	}

	@Override
	public ResponseEntity<List<VehicleDTO>> findAllVehiclesByCompanyIdpCode(String iDPCode, Pageable page) {
		log.debug("<<<<<< getOne driver>>>>", iDPCode);
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("company.companyIdpCode.keyword", iDPCode)).build();
		return vehicleResourceApi
				.createVehicleDtoListUsingPOST(esTemplate.queryForPage(searchQuery, Vehicle.class).getContent());
	}

	@Override
	public ResponseEntity<List<FreightDTO>> findAllFreightsByRequestedStatus(RequestStatus requestedStatus,
			Pageable pageable) {
		log.debug("<<<<<< input a requeststatus to get AllFreights>>" + requestedStatus.toString() + ">>>>"
				+ requestedStatus, pageable);
		SearchQuery sq = new NativeSearchQueryBuilder().withQuery(termQuery("requestedStatus.keyword", requestedStatus))
				.build();
		return freightResourceApi
				.createFreightDtoListUsingPOST(esTemplate.queryForPage(sq, Freight.class).getContent());
	}

	@Override
	public ResponseEntity<List<FreightDTO>> findAllFreightsByCustomerId(Long customerId, Pageable pageable) {
		log.debug("<<<<<< input a customerId to get AllFreights>>" + customerId + ">>>>" + customerId, pageable);
		SearchQuery sq = new NativeSearchQueryBuilder().withQuery(termQuery("customerId", customerId)).build();
		return freightResourceApi
				.createFreightDtoListUsingPOST(esTemplate.queryForPage(sq, Freight.class).getContent());
	}

	@Override
	public ResponseEntity<List<QuotationDTO>> findAllQuotationsByfreightId(Long freightId, Pageable pageable) {
		log.debug("<<<<<< findAllQuotations in impl >>>>>>>", freightId);
		SearchQuery sq = new NativeSearchQueryBuilder().withQuery(termQuery("freightId", freightId)).build();
		return quotationResourceApi
				.createQuotationsDtoListUsingPOST(esTemplate.queryForPage(sq, Quotation.class).getContent());
	}

	@Override
	public ResponseEntity<List<QuotationDTO>> findAllQuotationsByCompanyIdAndFreightId(Long companyId, Long freightId,
			Pageable pageable) {
		log.debug("<<<<< findAllQuotationsByCompanyIdAndFreightId>>>>>>", companyId, freightId);
		SearchQuery sq = new NativeSearchQueryBuilder().withQuery(QueryBuilders.boolQuery()
				.must(termQuery("companyId", companyId)).must(termQuery("freightId", freightId))).build();
		return quotationResourceApi
				.createQuotationsDtoListUsingPOST(esTemplate.queryForPage(sq, Quotation.class).getContent());
	}

	@Override
	public ResponseEntity<List<QuotationDTO>> findAllQuotationsByCompanyId(Long companyId, Pageable pageable) {
		log.debug("<<<<< findAllQuotationsByCompanyId>>>>>>", companyId);
		SearchQuery sq = new NativeSearchQueryBuilder().withQuery(termQuery("companyId", companyId)).build();
		return quotationResourceApi
				.createQuotationsDtoListUsingPOST(esTemplate.queryForPage(sq, Quotation.class).getContent());
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

		return queryResourceApi.getTasksUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups,
				candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState,
				description, dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables,
				includeTaskLocalVariables, involvedUser, maximumPriority, minimumPriority, name, nameLike, owner,
				ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, processDefinitionKeyLike,
				processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey,
				processInstanceBusinessKeyLike, processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId,
				tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	}

	@Override
	public ResponseEntity<List<FreightDTO>> getPendingFreights(String name, String nameLike, String assignee,
			String assigneeLike, String candidateUser, String candidateGroup, String candidateGroups,
			String processInstanceId, @Valid String processDefinitionId, @Valid String processDefinitionKey,
			@Valid String createdOn, @Valid String createdBefore, @Valid String createdAfter) {

		return queryResourceApi.getPendingFreightsUsingGET(assignee, assigneeLike, candidateGroup, candidateGroups,
				candidateUser, createdAfter, createdBefore, createdOn, name, nameLike, processDefinitionId,
				processDefinitionKey, processInstanceId);
	}

	@Override
	public ResponseEntity<List<FreightDTO>> findAllFreightByCompanyIdAndRequestStatus(Long companyId,
			RequestStatus requestedStatus, Pageable pageable) {
		log.debug("<<<<< findAllFreightByCompanyIdAndRequestStatus>>>>>>", companyId, requestedStatus);
		SearchQuery sq = new NativeSearchQueryBuilder().withQuery(QueryBuilders.boolQuery()
				.must(termQuery("companyId", companyId)).must(termQuery("requestedStatus.keyword", requestedStatus)))
				.build();
		return freightResourceApi
				.createFreightDtoListUsingPOST(esTemplate.queryForPage(sq, Freight.class).getContent());
	}

	@Override
	public ResponseEntity<FreightDTO> getBookingDetails(String processInstanceId) {

		return queryResourceApi.getBookingDetailsUsingGET(processInstanceId);
	}

	@Override
	public ResponseEntity<List<DriverDTO>> findAllDriversByComapanyIdpCode(String companyIdpCode, Pageable pageable) {
		log.debug("<<<<<< findAllDriversByComapanyIdpCode >>>>>>>", companyIdpCode);
		SearchQuery sq = new NativeSearchQueryBuilder()
				.withQuery(termQuery("company.companyIdpCode.keyword", companyIdpCode)).build();
		return driverResourceApi.createDtoListUsingPOST2(esTemplate.queryForPage(sq, Driver.class).getContent());
	}

}
