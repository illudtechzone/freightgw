package com.illud.freightgw.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Freight;
import com.illud.freightgw.client.freight.model.Vehicle;
import com.illud.freightgw.client.freight.model.VehicleLookUp;
import com.illud.freightgw.service.CommandService;

@RestController
@RequestMapping("/api/command")
public class CommandResource {
	
	private final Logger log =LoggerFactory.getLogger(CommandResource.class);
	private final CommandService comService;

	
	
	public CommandResource(CommandService commantService) {
		this.comService=commantService;
	}
	@PostMapping("/create/company")
	public ResponseEntity<Company> createCompany(@RequestBody Company company) {
		log.debug("<<<<<<<<<<< create Comapny >>>>>>>>",company);
		return comService.save(company);
		
	}
	
	@PutMapping("/update/company")
	public ResponseEntity<Company> updateCompany(@RequestBody Company company) {
		log.debug("<<<<<<<< update company >>>>>>>>>", company);
		return comService.update(company);	
	}
	
	@PostMapping("/create/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		log.debug("<<<<<<<< update customer >>>>>>>>>", customer);
		return comService.save(customer);
		
	}
	@PutMapping("/update/customer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		log.debug("<<<<<<<< update company >>>>>>>>>", customer);
		return comService.update(customer);	
	}
	@PostMapping("/create/freight")
	public ResponseEntity<Freight> createFreight(@RequestBody Freight freight){
		log.debug("<<<<<<<< update customer >>>>>>>>>", freight);
		return comService.save(freight);
		
	}
	@PutMapping("/update/freight")
	public ResponseEntity<Freight> updateFreight(@RequestBody Freight freight) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", freight);
		return comService.update(freight);	
	}
	@PostMapping("/create/driver")
	public ResponseEntity<Driver> createDriver(@RequestBody Driver driver){
		log.debug("<<<<<<<< update customer >>>>>>>>>", driver);
		return comService.save(driver);
		
	}
	@PutMapping("/update/driver")
	public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", driver);
		return comService.update(driver);	
	}
	@PostMapping("/create/vehicle")
	public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle){
		log.debug("<<<<<<<< update customer >>>>>>>>>", vehicle);
		return comService.save(vehicle);
		
	}
	@PutMapping("/update/vehicle")
	public ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle vehicle) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", vehicle);
		return comService.update(vehicle);	
	}
	@PostMapping("/create/vehiclelookup")
	public ResponseEntity<VehicleLookUp> createVehicleLookUp(@RequestBody VehicleLookUp vehicleLookUp){
		log.debug("<<<<<<<< update customer >>>>>>>>>", vehicleLookUp);
		return comService.save(vehicleLookUp);
		
	}
	@PutMapping("/update/vehiclelookup")
	public ResponseEntity<VehicleLookUp> updateVehicleLookUp(@RequestBody VehicleLookUp vehicleLookUp) {
		log.debug("<<<<<<<< update freight >>>>>>>>>", vehicleLookUp);
		return comService.update(vehicleLookUp);	
	}

}
