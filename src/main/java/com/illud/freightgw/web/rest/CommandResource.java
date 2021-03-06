package com.illud.freightgw.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.freightgw.client.freight.api.CompanyResourceApi;
import com.illud.freightgw.client.freight.api.DriverDocumentResourceApi;
import com.illud.freightgw.client.freight.api.QuotationResourceApi;
import com.illud.freightgw.client.freight.model.*;
import com.illud.freightgw.service.CommandService;

@RestController
@RequestMapping("/api/command")
public class CommandResource {

	private final Logger log = LoggerFactory.getLogger(CommandResource.class);
	private final CommandService comService;

	@Autowired
	CompanyResourceApi api;
	@Autowired
	QuotationResourceApi quotationApi;
	@Autowired
	DriverDocumentResourceApi driDocApi;

	public CommandResource(CommandService commantService) {
		this.comService = commantService;
	}
	
	// <<<<<<<<<<<<<<                         company                      >>>>>>>>>>>>>

	@PostMapping("/create/company")
	public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO company) {
		log.debug("<<<<<<<<<<< create Comapny >>>>>>>>", company);

		// return comService.save(company);
		return api.createCompanyUsingPOST(company);

	}
	@PutMapping("/update/company")
	public ResponseEntity<CompanyDTO> updateCompany(@RequestBody CompanyDTO company) {
		log.debug("<<<<<<<< update company >>>>>>>>>", company);
		return comService.update(company);
	}
	@PostMapping("/create/company/ifnotexist")
	public ResponseEntity<CompanyDTO> createcompanyIfnotExist(@RequestBody CompanyDTO companyDTO) {
		log.debug("<<<<<<< create companyIfnotExist>>>>>>>", companyDTO);
		return comService.createcompanyIfnotExist(companyDTO);

	}
	
	//   <<<<<<<<<<<<<<<<<<<<                Quotation                 >>>>>>>>>>>>>>>>>>>>
	
	@PostMapping("/create/quotation")
	public ResponseEntity<QuotationDTO> createQuotation(@RequestBody QuotationDTO quotationDTO) {
		log.debug("<<<<<<<<<<< create Comapny >>>>>>>>", quotationDTO);
		
		// return comService.save(company);
		return comService.save(quotationDTO);

	}
	@PutMapping("/update/quotation")
	public ResponseEntity<QuotationDTO> updateQuotation(@RequestBody QuotationDTO quotationDTO){
		log.debug("<<<<< updateQuotation >>>>>>>",quotationDTO);
		return comService.update(quotationDTO);
		
	}

	
	
	//   <<<<<<<<<<<<<<<<<<             customer                >>>>>>>>>>>>>>>>>>

	@PostMapping("/create/customer")
	public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customer) {
		log.debug("<<<<<<<< update customer >>>>>>>>>", customer);
		return comService.save(customer);
	}
	@PutMapping("/update/customer")
	public ResponseEntity<CustomerDTO> updateCustomer(@RequestBody CustomerDTO customer) {
		log.debug("<<<<<<<< update company >>>>>>>>>", customer);
		return comService.update(customer);
	}
	@PostMapping("/create/customer/ifnotexist")
	public ResponseEntity<CustomerDTO> createcustomerIfnotExist(@RequestBody CustomerDTO customerDTO) {
		log.debug("<<<<<<< customer customer if not exist >>>>>>>", customerDTO);
		return comService.createcustomerIfnotExist(customerDTO);
	}

	//   <<<<<<<<<<<<<<<<<<<<<       freight         >>>>>>>>>>>>>>>>>>>>>
	
	@PutMapping("/update/freight")
	public ResponseEntity<FreightDTO> updateFreight(@RequestBody FreightDTO freight) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", freight);
		return comService.update(freight);
	}
	@PostMapping("/updateFreight/{vehicleId}")
	public ResponseEntity<FreightDTO> assignVehicle(@RequestBody FreightDTO freightDTO,@PathVariable Long vehicleId){
		log.debug("<<<<<<<<assignUpdateFreight>>>>>",freightDTO,vehicleId);
		
		return comService.createAssignVehicle(freightDTO,vehicleId);
		
	}
	@PostMapping("/create/freight")
	public ResponseEntity<FreightDTO> createFreight(@RequestBody FreightDTO freight) {
		log.debug("<<<<<<<< create freight >>>>>>>>>", freight);
		return comService.save(freight);	
	}

	
	//   <<<<<<<<<<<<<<<<<<               driver             >>>>>>>>>>>>>>
	
	
	@PostMapping("/create/driver")
	public ResponseEntity<DriverDTO> createDriver(@RequestBody DriverDTO driver) {
		log.debug("<<<<<<<< update customer >>>>>>>>>", driver);
		return comService.save(driver);

	}

	@PutMapping("/update/driver")
	public ResponseEntity<DriverDTO> updateDriver(@RequestBody DriverDTO driver) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", driver);
		return comService.update(driver);
	}
	@PostMapping("/create/driver/ifnotexist")
	public ResponseEntity<DriverDTO> createdriverIfnotExist(@RequestBody DriverDTO driverDTO) {
		log.debug("<<<<< create driver if not exist >>>>>", driverDTO);
		return comService.createdriverIfnotExist(driverDTO);

	}

	@DeleteMapping("/deletedriver/{driverId}")
	public void deleteDriver(@PathVariable Long driverId) {
		log.debug("<<<<<<< delete driver >>>>>>>>>",driverId);
		comService.deleteDriver(driverId);
	}
	
	
	//   <<<<<<<<<<<<<<<                    vehicle              >>>>>>>>>>>>>>>
	
	
	@PostMapping("/create/vehicle")
	public ResponseEntity<VehicleDTO> createVehicle(@RequestBody VehicleDTO vehicle) {
		log.debug("<<<<<<<< update customer >>>>>>>>>", vehicle);
		return comService.save(vehicle);

	}

	@PutMapping("/update/vehicle")
	public ResponseEntity<VehicleDTO> updateVehicle(@RequestBody VehicleDTO vehicle) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", vehicle);
		return comService.update(vehicle);
	}
	@DeleteMapping("/delete/vehicle/{vehicleId}/{vehicleLookupId}")
	public void deleteVehicle(@PathVariable Long vehicleId,@PathVariable Long vehicleLookupId) {
		log.debug("<<<<< delete vehicle >>>>>"+vehicleId+vehicleLookupId);
		comService.deleteVehicle(vehicleId);
		comService.deleteVehicleLookup(vehicleLookupId);
	}

	//   <<<<<<<<<<<<<<<<<<                 vehicle look up          >>>>>>>>>>>
	
	@PostMapping("/create/vehiclelookup")
	public ResponseEntity<VehicleLookUpDTO> createVehicleLookUp(@RequestBody VehicleLookUpDTO vehicleLookUp) {
		log.debug("<<<<<<<< update customer >>>>>>>>>", vehicleLookUp);
		return comService.save(vehicleLookUp);

	}

	@PutMapping("/update/vehiclelookup")
	public ResponseEntity<VehicleLookUpDTO> updateVehicleLookUp(@RequestBody VehicleLookUpDTO vehicleLookUp) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", vehicleLookUp);
		return comService.update(vehicleLookUp);
	}


	//  <<<<<<<<<<<            driver document             >>>>>>>>>>>>


	

	@PostMapping("/create/driverdocument")
	public ResponseEntity<DriverDocumentDTO> createDriverDocumnet(@RequestBody DriverDocumentDTO driDocDTO){
		log.debug("<<<<<<<  create DriverDocumnet in resource >>>>>>",driDocDTO);
		return driDocApi.createDriverDocumentUsingPOST(driDocDTO);
	}
	@PutMapping("/update/driverdocument")
	public ResponseEntity<DriverDocumentDTO> updateDriverDocumnet(@RequestBody DriverDocumentDTO driDocDTO){
		log.debug("<<<<<<<  update DriverDocumnet in resource >>>>>>",driDocDTO);
		return driDocApi.updateDriverDocumentUsingPUT(driDocDTO);
	}
	@DeleteMapping("/update/{driverdocumentId}")
	public void  deleteDriverDocumnet(@PathVariable Long driverdocumentId){
		log.debug("<<<<<<<  delete DriverDocumnet in resource >>>>>>",driverdocumentId);
		this.driDocApi.deleteDriverDocumentUsingDELETE(driverdocumentId);
	}
	
	//    <<<<<<<<<<<<             vehicle staff            >>>>>>>>>>>
	
	@PostMapping("/create/vehicleStaff")
	public ResponseEntity<VehicleStaffDTO> assignNewVehicleStaff(@RequestBody VehicleStaffDTO vehStaffDTO){
		log.debug("<<<<<<<< createVehicleStaff >>>>>>>",vehStaffDTO);
		return comService.createVehicleStaff(vehStaffDTO);
		
	}
	@PutMapping("/update/vehicleStaff")
	public ResponseEntity<VehicleStaffDTO> reAssignVehicleStaff(@RequestBody VehicleStaffDTO vehStaffDTO){
		log.debug("<<<<<< updateVehicleStaff >>>>>>",vehStaffDTO);
		return comService.updateVehicleStaff(vehStaffDTO);
	}
//	@PostMapping("/assignvehiclestaff/{staffId}/{vehicleId}")
//	public ResponseEntity<VehicleStaffDTO> assignNewVehicleStaffForDriver(@PathVariable Long staffId,@PathVariable Long vehicleId){
//		log.debug("<<<<<<<<< assignVehicleStaffForDriver >>>>>>>",vehicleId,staffId);
//		return comService.assignStaffForDriver(vehicleId,staffId);
//		
//	}

	/////////////////////////// activiti-workflow-apis///////////////////////////////////


	@PostMapping("/sendQuatation/{taskId}")
	public void sendQuatation(@PathVariable String taskId, @RequestBody QuotationDTO response) {
		comService.sendQuatation(taskId, response);

	}
	@PostMapping("/customer/status/{taskId}")
	public void customerStatus(@PathVariable String taskId, @RequestBody CustomerStatus customerStatus) {
		comService.customerStatus(taskId, customerStatus);
	}

}
