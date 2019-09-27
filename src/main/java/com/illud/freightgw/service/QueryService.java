package com.illud.freightgw.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.DataResponse;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Freight;
import com.illud.freightgw.client.freight.model.RequestStatus;
import com.illud.freightgw.client.freight.model.FreightDTO;
import com.illud.freightgw.client.freight.model.Quotation;
import com.illud.freightgw.client.freight.model.Vehicle;

public interface QueryService {

	Company getOneCompany(String companyIdpCode);

	Customer getOneCustomer(String customerIdpCode);

	Driver getOneDriver(String driverIdpCode);

	Page<Vehicle> findAllVehiclesByCompanyIdpCode(String companyiDPCode, Pageable page);

	ResponseEntity<List<FreightDTO>> findAllFreightsByRequestedStatus(RequestStatus requestedStatus, Pageable pageable);
	
	Page<Quotation> findAllQuotationsByfreightId(Long freightId, Pageable pageable);

	ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
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
			@Valid String candidateOrAssigned, @Valid String category);

	ResponseEntity<List<FreightDTO>> getPendingFreights(String name, String nameLike, String assignee, String assigneeLike,
			String candidateUser, String candidateGroup, String candidateGroups, String processInstanceId,
			@Valid String processDefinitionId, @Valid String processDefinitionKey, @Valid String createdOn,
			@Valid String createdBefore, @Valid String createdAfter);

	ResponseEntity<FreightDTO> getBookingDetails(String processInstanceId);

	


}
