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
	
	@GetMapping("/getcompany/{iDPCode}")
	public Company searchCompanyIDPCode(@PathVariable String iDPCode){
		log.debug("<<<<<<<<< input a idpcode to get a company details >>>>>>" , iDPCode);
		
		return queService.getOneCompany(iDPCode);
		
	}
	@GetMapping("/getcustomer/{iDPCode}")
	public Customer searchCustomerIDPCode(@PathVariable String iDPCode){
		log.debug(" <<<<<<<<< input a idpcode to get a customer details>>>>>> " , iDPCode);
		//Page<Customer> page = queService.getDetailsFromCustomeriDPCode(iDPCode);
		//return ResponseEntity.ok().body(page.getContent());
		
		return queService.getOneCustomer(iDPCode);
	}
	@GetMapping("/getdriver/{iDPCode}")
	public Driver searchDriverIDPCode(@PathVariable String iDPCode){
		log.debug("<<<<<<<<< input a idpcode to get a driver details >>>>>>" , iDPCode);
		
		return queService.getOneDriver(iDPCode);
		
	}
	@GetMapping("/getAllvehicles")
	public ResponseEntity<List<Vehicle>> findAllvehicles(String iDPCode,Pageable pageable){
		log.debug("<<<<<<<< input a idpcode to get all vehicles >>>>>>>>",iDPCode,pageable);
		Page<Vehicle> page = queService.findAllVehiclesByCompanyIdpCode(iDPCode, pageable);
		return ResponseEntity.ok().body(page.getContent());
		
	}

}
