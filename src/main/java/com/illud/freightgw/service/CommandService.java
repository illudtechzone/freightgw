package com.illud.freightgw.service;

import org.springframework.http.ResponseEntity;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Freight;
import com.illud.freightgw.client.freight.model.Vehicle;
import com.illud.freightgw.client.freight.model.*;

public interface CommandService {
	ResponseEntity<CompanyDTO> update(CompanyDTO company);

	//ResponseEntity<Company> save(Company company);

	ResponseEntity<CustomerDTO> save(CustomerDTO customer);

	ResponseEntity<CustomerDTO> update(CustomerDTO customer);

	ResponseEntity<FreightDTO> save(FreightDTO freight);

	ResponseEntity<FreightDTO> update(FreightDTO freight);

	ResponseEntity<DriverDTO> save(DriverDTO driver);

	ResponseEntity<DriverDTO> update(DriverDTO driver);

	ResponseEntity<VehicleDTO> save(VehicleDTO vehicle);

	ResponseEntity<VehicleDTO> update(VehicleDTO vehicle);

	ResponseEntity<VehicleLookUpDTO> save(VehicleLookUpDTO vehicleLookUp);

	ResponseEntity<VehicleLookUpDTO> update(VehicleLookUpDTO vehicleLookUp);

	 

}
