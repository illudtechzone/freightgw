package com.illud.freightgw.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Vehicle;

public interface QueryService {

	Company getOneCompany(String companyIdpCode);

	Customer getOneCustomer(String customerIdpCode);

	Driver getOneDriver(String driverIdpCode);

	Page<Vehicle> findAllVehiclesByCompanyIdpCode(String companyiDPCode, Pageable page);
	
	
	Page<Vehicle> findAllRequestedFreights(Pageable pageable);
}
