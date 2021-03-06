package com.illud.freightgw.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.CompanyDTO;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.CustomerDTO;
import com.illud.freightgw.client.freight.model.DataResponse;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.DriverDTO;
import com.illud.freightgw.client.freight.model.Freight;
import com.illud.freightgw.client.freight.model.FreightDTO;
import com.illud.freightgw.client.freight.model.Quotation;
import com.illud.freightgw.client.freight.model.QuotationDTO;
import com.illud.freightgw.client.freight.model.RequestStatus;
import com.illud.freightgw.client.freight.model.Vehicle;
import com.illud.freightgw.client.freight.model.VehicleDTO;
import com.illud.freightgw.client.freight.model.VehicleLookUp;
import com.illud.freightgw.client.freight.model.VehicleLookUpDTO;
import com.illud.freightgw.service.QueryService;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class QueryResource {

private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	
	private final QueryService queService;
	

	
	public QueryResource(QueryService queService) {
		this.queService=queService;
	}
	
	@GetMapping("/findCompanybyId/{id}")
	public ResponseEntity<CompanyDTO> findCompanyById(@PathVariable Long id){
		log.debug("<<<<<<<<< input a id to get a company details >>>>>>" , id);
		
		return queService.findCompanyById(id);
		
	}
	@GetMapping("/findCustomerbyId/{id}")
	public ResponseEntity<CustomerDTO> findCustomerById(@PathVariable Long id){
		log.debug(" <<<<<<<<< input a id to get a customer details>>>>>> " , id);
		
		return queService.findCustomerById(id);
	}
	@GetMapping("/findDriverbyId/{id}")
	public ResponseEntity<DriverDTO> findDriverById(@PathVariable Long id){
		log.debug("<<<<<<<<< input a id to get a driver details >>>>>>" , id);
		
		return queService.findDriverById(id);
	}
	@GetMapping("/findFreightbyId/{id}")
	public  ResponseEntity<FreightDTO> findFreightId(@PathVariable Long id){
		log.debug("<<<<<<<<< input a id to get a driver details >>>>>>" , id);
		
		return queService.findFreightId(id);
	}
	@GetMapping("/findVehiclelookupId/{id}")
	public ResponseEntity<VehicleLookUpDTO> findVehicleLookUpById(@PathVariable Long id){
		log.debug(" <<<<<<<<< input a id to get a vehicle look up id details>>>>>> " , id);
		
		return queService.findVehicleLookUpById(id);
	}
	
	@GetMapping("/getcompany/{companyIdpCode}")
	public ResponseEntity<CompanyDTO> searchCompanyIDPCode(@PathVariable String companyIdpCode){
		log.debug("<<<<<<<<< input a idpcode to get a company details >>>>>>" , companyIdpCode);
		
		return queService.getOneCompany(companyIdpCode);
		
	}
	@GetMapping("/getcustomer/{customerIdpCode}")
	public ResponseEntity<CustomerDTO> searchCustomerIDPCode(@PathVariable String customerIdpCode){
		log.debug(" <<<<<<<<< input a idpcode to get a customer details>>>>>> " , customerIdpCode);
		//Page<Customer> page = queService.getDetailsFromCustomeriDPCode(iDPCode);
		//return ResponseEntity.ok().body(page.getContent());
		
		return queService.getOneCustomer(customerIdpCode);
	}
	@GetMapping("/getdriver/{driverIdpCode}")
	public ResponseEntity<DriverDTO> searchDriverIDPCode(@PathVariable String driverIdpCode){
		log.debug("<<<<<<<<< input a idpcode to get a driver details >>>>>>" , driverIdpCode);
		
		return queService.getOneDriver(driverIdpCode);
		
	}
	@GetMapping("/getAllvehicles/{companyIdpCode}")
	public ResponseEntity<List<VehicleDTO>> findAllvehicles(@PathVariable String companyIdpCode,Pageable pageable){
		log.debug("<<<<<<<< input a idpcode to get all vehicles >>>>>>>>",companyIdpCode,pageable);
		
		return  queService.findAllVehiclesByCompanyIdpCode(companyIdpCode, pageable);
		
	}
	@GetMapping("/getAllFreight/{requestedStatus}")
	public ResponseEntity<List<FreightDTO>> findAllFreights(@PathVariable RequestStatus requestedStatus,Pageable pageable){
		log.debug("<<<<<<<<< getall freights input requestedstatus>>>>>>>"+requestedStatus);
		return queService.findAllFreightsByRequestedStatus(requestedStatus,pageable);
		
		
	}
	
	@GetMapping("/getAllFreightByCompanyIdAndStatus/{companyId}/{requestedStatus}")
	public ResponseEntity<List<FreightDTO>> findAllFreights(@PathVariable Long companyId,@PathVariable RequestStatus requestedStatus,Pageable pageable){
		log.debug("<<<<<<<<< getall freights input requestedstatus>>>>>>>"+requestedStatus);
		return queService.findAllFreightByCompanyIdAndRequestStatus(companyId,requestedStatus,pageable);
		
		
	}
	@GetMapping("/freights/{customerId}")
	public ResponseEntity<List<FreightDTO>> findAllFreightsByCustomerId(@PathVariable Long customerId,Pageable pageable){
		log.debug("<<<<<<< findAllFreightDTO >>>>>>",customerId);
		
		return queService.findAllFreightsByCustomerId(customerId,pageable);
		
	}
	
	@GetMapping("/getAllQuotations/{freightId}")
	public ResponseEntity<List<QuotationDTO>> findAllQuotations(@PathVariable Long freightId,Pageable pageable){
		log.debug("<<<<<<< findAllQuotations >>>>>>",freightId);
		
		return queService.findAllQuotationsByfreightId(freightId, pageable);
		
	}
	
	@GetMapping("/getAllQuotationsby/{companyId}/{freightId}")
	public ResponseEntity<List<QuotationDTO>> findAllQuotationsByCompanyIdAndFreightId(@PathVariable Long companyId,@PathVariable Long freightId,Pageable pageable){
		log.debug("<<<<<<<< findAllQuotationsByCompanyIdandFreightId>>>>>>>",companyId,freightId);
		
		return queService.findAllQuotationsByCompanyIdAndFreightId(companyId, freightId, pageable);
		
	}
	
	@GetMapping("/getAllQuotationsbyCompanyId/{companyId}")
	public ResponseEntity<List<QuotationDTO>> findAllQuotationsByCompanyId(@PathVariable Long companyId,Pageable pageable){
		log.debug("<<<<<<<< findAllQuotationsByCompanyId>>>>>>>",companyId);
		
		return queService.findAllQuotationsByCompanyId(companyId, pageable);
		
	}
	@GetMapping("/getAllDriversbyCompanyidpcode/{companyIdpCode}")
	public ResponseEntity<List<DriverDTO>> findAllDriversByCompanyIdpCode(@PathVariable String companyIdpCode,Pageable pageable){
		log.debug("<<<<<< findAllDriversByCompanyIdpCode >>>>>>>",companyIdpCode);
		
		return queService.findAllDriversByComapanyIdpCode(companyIdpCode, pageable);
		
	}
	/*
	 * @GetMapping("/getAllDriverdocumentsbyDriverId") public
	 * ResponseEntity<List<DriverDocument>>
	 */
	
	//////////////////////////activiti-workflow-apis///////////////////////////////////
	
	@GetMapping("/tasks")
	public ResponseEntity<DataResponse> getTasks(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "priority", required = false) String priority,
			@RequestParam(value = "minimumPriority", required = false) String minimumPriority,
			@RequestParam(value = "maximumPriority", required = false) String maximumPriority,
			@RequestParam(value = "assignee", required = false) String assignee,
			@RequestParam(value = "assigneeLike", required = false) String assigneeLike,
			@RequestParam(value = "owner", required = false) String owner,
			@RequestParam(value = "ownerLike", required = false) String ownerLike,
			@RequestParam(value = "unassigned", required = false) String unassigned,
			@RequestParam(value = "delegationState", required = false) String delegationState,
			@RequestParam(value = "candidateUser", required = false) String candidateUser,
			@RequestParam(value = "candidateGroup", required = false) String candidateGroup,
			@RequestParam(value = "candidateGroups", required = false) String candidateGroups,
			@RequestParam(value = "involvedUser", required = false) String involvedUser,
			@RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,
			@RequestParam(value = "taskDefinitionKeyLike", required = false) String taskDefinitionKeyLike,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processInstanceBusinessKey", required = false) String processInstanceBusinessKey,
			@RequestParam(value = "processInstanceBusinessKeyLike", required = false) String processInstanceBusinessKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given id.") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given key.") @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a key like the given value.") @Valid @RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given name.") @Valid @RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a name like the given value.") @Valid @RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,
			@ApiParam(value = "Only return tasks which are part of the execution with the given id.") @Valid @RequestParam(value = "executionId", required = false) String executionId,
			@ApiParam(value = "Only return tasks which are created on the given date.") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,
			@ApiParam(value = "Only return tasks which are created before the given date.") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,
			@ApiParam(value = "Only return tasks which are created after the given date.") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter,
			@ApiParam(value = "Only return tasks which are due on the given date.") @Valid @RequestParam(value = "dueOn", required = false) String dueOn,
			@ApiParam(value = "Only return tasks which are due before the given date.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,
			@ApiParam(value = "Only return tasks which are due after the given date.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,
			@ApiParam(value = "Only return tasks which don�t have a due date. The property is ignored if the value is false.") @Valid @RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,
			@ApiParam(value = "Only return tasks that are not a subtask of another task.") @Valid @RequestParam(value = "excludeSubTasks", required = false) Boolean excludeSubTasks,
			@ApiParam(value = "If true, only return tasks that are not suspended (either part of a process that is not suspended or not part of a process at all). If false, only tasks that are part of suspended process instances are returned.") @Valid @RequestParam(value = "active", required = false) Boolean active,
			@ApiParam(value = "Indication to include task local variables in the result.") @Valid @RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,
			@ApiParam(value = "Indication to include process variables in the result.") @Valid @RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@ApiParam(value = "Only return tasks with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,
			@ApiParam(value = "Only return tasks with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@ApiParam(value = "If true, only returns tasks without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@ApiParam(value = "Select tasks that has been claimed or assigned to user or waiting to claim by user (candidate user or groups).") @Valid @RequestParam(value = "candidateOrAssigned", required = false) String candidateOrAssigned,
			@ApiParam(value = "Select tasks with the given category. Note that this is the task category, not the category of the process definition (namespace within the BPMN Xml). ") @Valid @RequestParam(value = "category", required = false) String category) {

		return queService.getTasks(name, nameLike, description, priority, minimumPriority, maximumPriority,
				assignee, assigneeLike, owner, ownerLike, unassigned, delegationState, candidateUser, candidateGroup,
				candidateGroups, involvedUser, taskDefinitionKey, taskDefinitionKeyLike, processInstanceId,
				processInstanceBusinessKey, processInstanceBusinessKeyLike, processDefinitionId, processDefinitionKey,
				processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, executionId, createdOn,
				createdBefore, createdAfter, dueOn, dueBefore, dueAfter, withoutDueDate, excludeSubTasks, active,
				includeTaskLocalVariables, includeProcessVariables, tenantId, tenantIdLike, withoutTenantId,
				candidateOrAssigned, category);
	}

	
	@GetMapping("/getPendingFreights")
    public ResponseEntity<List<FreightDTO>> getPendingFreights(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "assignee", required = false) String assignee,
			@RequestParam(value = "assigneeLike", required = false) String assigneeLike,
			@RequestParam(value = "candidateUser", required = false) String candidateUser,
			@RequestParam(value = "candidateGroup", required = false) String candidateGroup,
			@RequestParam(value = "candidateGroups", required = false) String candidateGroups,
			
			
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given id.") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given key.") @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
		@ApiParam(value = "Only return tasks which are created on the given date.") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,
		@ApiParam(value = "Only return tasks which are created before the given date.") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,
		@ApiParam(value = "Only return tasks which are created after the given date.") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter){
		return queService.getPendingFreights(name,nameLike,assignee,assigneeLike,candidateUser,candidateGroup,candidateGroups,processInstanceId,processDefinitionId,processDefinitionKey,createdOn, createdBefore, createdAfter);
    	
    }
    
    
    @GetMapping("/getBookingDetails/{processInstanceId}")
    public ResponseEntity<FreightDTO> getBookingDetails(@PathVariable(value = "processInstanceId") String processInstanceId) {
    	return queService.getBookingDetails(processInstanceId);
    }
	
	
	
	
}
