package com.illud.freightgw.service;

import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;

public interface QueryService {

	Company getOneCompany(String iDPCode);

	Customer getOneCustomer(String iDPCode);

	Driver getOneDriver(String iDPCode);
}
