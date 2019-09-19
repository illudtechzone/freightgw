package com.illud.freightgw.service;

import org.springframework.http.ResponseEntity;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Freight;
import com.illud.freightgw.client.freight.model.Vehicle;
import com.illud.freightgw.client.freight.model.VehicleLookUp;

public interface CommandService {
	ResponseEntity<Company> update(Company company);

	ResponseEntity<Company> save(Company company);

	ResponseEntity<Customer> save(Customer customer);

	ResponseEntity<Customer> update(Customer customer);

	ResponseEntity<Freight> save(Freight freight);

	ResponseEntity<Freight> update(Freight freight);

	ResponseEntity<Driver> save(Driver driver);

	ResponseEntity<Driver> update(Driver driver);

	ResponseEntity<Vehicle> save(Vehicle vehicle);

	ResponseEntity<Vehicle> update(Vehicle vehicle);

	ResponseEntity<VehicleLookUp> save(VehicleLookUp vehicleLookUp);

	ResponseEntity<VehicleLookUp> update(VehicleLookUp vehicleLookUp);

	 

}
