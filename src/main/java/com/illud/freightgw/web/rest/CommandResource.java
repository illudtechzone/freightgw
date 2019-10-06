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
import com.illud.freightgw.client.freight.api.QuotationResourceApi;
import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Freight;
import com.illud.freightgw.client.freight.model.Vehicle;
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

	public CommandResource(CommandService commantService) {
		this.comService = commantService;
	}

	@PostMapping("/create/company")
	public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO company) {
		log.debug("<<<<<<<<<<< create Comapny >>>>>>>>", company);

		// return comService.save(company);
		return api.createCompanyUsingPOST(company);

	}
	
	@PostMapping("/create/quotation")
	public ResponseEntity<QuotationDTO> createQuotation(@RequestBody QuotationDTO quotationDTO) {
		log.debug("<<<<<<<<<<< create Comapny >>>>>>>>", quotationDTO);

		// return comService.save(company);
		return quotationApi.createQuotationUsingPOST(quotationDTO);

	}

	@PutMapping("/update/company")
	public ResponseEntity<CompanyDTO> updateCompany(@RequestBody CompanyDTO company) {
		log.debug("<<<<<<<< update company >>>>>>>>>", company);
		return comService.update(company);
	}

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
	@PutMapping("/update/freight")
	public ResponseEntity<FreightDTO> updateFreight(@RequestBody FreightDTO freight) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", freight);
		return comService.update(freight);
	}

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

	@PostMapping("/create/company/ifnotexist")
	public ResponseEntity<CompanyDTO> createcompanyIfnotExist(@RequestBody CompanyDTO companyDTO) {
		log.debug("<<<<<<< create companyIfnotExist>>>>>>>", companyDTO);
		return comService.createcompanyIfnotExist(companyDTO);

	}

	@PostMapping("/create/customer/ifnotexist")
	public ResponseEntity<CustomerDTO> createcustomerIfnotExist(@RequestBody CustomerDTO customerDTO) {
		log.debug("<<<<<<< customer customer if not exist >>>>>>>", customerDTO);
		return comService.createcustomerIfnotExist(customerDTO);
	}

	@PostMapping("/create/driver/ifnotexist")
	public ResponseEntity<DriverDTO> createdriverIfnotExist(@RequestBody DriverDTO driverDTO) {
		log.debug("<<<<< create driver if not exist >>>>>", driverDTO);
		return comService.createdriverIfnotExist(driverDTO);

	}
	
	@DeleteMapping("/delete/vehicle/{vehicleId}/{vehicleLookupId}")
	public void deleteVehicle(@PathVariable Long vehicleId,@PathVariable Long vehicleLookupId) {
		log.debug("<<<<< delete vehicle >>>>>"+vehicleId+vehicleLookupId);
		comService.deleteVehicle(vehicleId);
		comService.deleteVehicleLookup(vehicleLookupId);
	}

	/////////////////////////// activiti-workflow-apis///////////////////////////////////

	@PostMapping("/create/freight")
	public ResponseEntity<FreightDTO> createFreight(@RequestBody FreightDTO freight) {
		log.debug("<<<<<<<< create freight >>>>>>>>>", freight);
		return comService.save(freight);	
	}

	@PostMapping("/sendQuatation/{taskId}")
	public void sendQuatation(@PathVariable String taskId, @RequestBody QuotationDTO response) {
		comService.sendQuatation(taskId, response);

	}
	@PostMapping("/customer/status/{taskId}")
	public void customerStatus(@PathVariable String taskId, @RequestBody CustomerStatus customerStatus) {
		comService.customerStatus(taskId, customerStatus);
	}

}
