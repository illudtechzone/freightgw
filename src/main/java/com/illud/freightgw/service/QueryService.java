package com.illud.freightgw.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Vehicle;

public interface QueryService {

	Company getOneCompany(String iDPCode);

	Customer getOneCustomer(String iDPCode);

	Driver getOneDriver(String iDPCode);

	Page<Vehicle> findAllVehiclesByCompanyIdpCode(String iDPCode, Pageable page);
}
