package com.illud.freightgw.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Vehicle;
import com.illud.freightgw.service.QueryService;

@RestController
@RequestMapping("api")
public class QueryResource {

private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	
	private final QueryService queService;
	
	public QueryResource(QueryService queService) {
		this.queService=queService;
	}
	
	@GetMapping("/getcompany/{companyIdpCode}")
	public Company searchCompanyIDPCode(@PathVariable String companyIdpCode){
		log.debug("<<<<<<<<< input a idpcode to get a company details >>>>>>" , companyIdpCode);
		
		return queService.getOneCompany(companyIdpCode);
		
	}
	@GetMapping("/getcustomer/{customerIdpCode}")
	public Customer searchCustomerIDPCode(@PathVariable String customerIdpCode){
		log.debug(" <<<<<<<<< input a idpcode to get a customer details>>>>>> " , customerIdpCode);
		//Page<Customer> page = queService.getDetailsFromCustomeriDPCode(iDPCode);
		//return ResponseEntity.ok().body(page.getContent());
		
		return queService.getOneCustomer(customerIdpCode);
	}
	@GetMapping("/getdriver/{driverIdpCode}")
	public Driver searchDriverIDPCode(@PathVariable String driverIdpCode){
		log.debug("<<<<<<<<< input a idpcode to get a driver details >>>>>>" , driverIdpCode);
		
		return queService.getOneDriver(driverIdpCode);
		
	}
	@GetMapping("/getAllvehicles")
	public ResponseEntity<List<Vehicle>> findAllvehicles(String companyIdpCode,Pageable pageable){
		log.debug("<<<<<<<< input a idpcode to get all vehicles >>>>>>>>",companyIdpCode,pageable);
		Page<Vehicle> page = queService.findAllVehiclesByCompanyIdpCode(companyIdpCode, pageable);
		return ResponseEntity.ok().body(page.getContent());
		
	}

}
