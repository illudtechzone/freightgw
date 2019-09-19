package com.illud.freightgw.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.illud.freightgw.client.freight.api.CompanyResourceApi;
import com.illud.freightgw.client.freight.api.CustomerResourceApi;
import com.illud.freightgw.client.freight.api.DriverResourceApi;
import com.illud.freightgw.client.freight.api.FreightResourceApi;
import com.illud.freightgw.client.freight.api.VehicleLookUpResourceApi;
import com.illud.freightgw.client.freight.api.VehicleResourceApi;
import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Customer;
import com.illud.freightgw.client.freight.model.Driver;
import com.illud.freightgw.client.freight.model.Freight;
import com.illud.freightgw.client.freight.model.Vehicle;
import com.illud.freightgw.client.freight.model.VehicleLookUp;
import com.illud.freightgw.service.CommandService;

@Service
public class CommandServiceImpl implements CommandService{
	
private final Logger log =LoggerFactory.getLogger(CommandServiceImpl.class);
	
	@Autowired
	CompanyResourceApi comResourceApi;
	@Autowired
	CustomerResourceApi cusResourceApi;
	@Autowired
	FreightResourceApi freResourceApi;
	@Autowired
	DriverResourceApi driResourceApi;
	@Autowired
	VehicleResourceApi vehResourceApi;
	@Autowired
	VehicleLookUpResourceApi vehLookUpResourceApi;
	


	@Override
	public ResponseEntity<Company> update(Company company) {
		log.debug("<<<<<< update >>>>>>",company);
		return comResourceApi.updateCompanyUsingPUT(company);
	}

	/*
	 * @Override public ResponseEntity<Company> save(Company company) {
	 * log.debug("<<<<<< create company in impl >>>>>>",company); return
	 * comResourceApi.createCompanyUsingPOST(company); }
	 */

	@Override
	public ResponseEntity<Customer> save(Customer customer) {
		log.debug("<<<<<< create customer in impl >>>>>>",customer);
		return cusResourceApi.createCustomerUsingPOST(customer);
	}

	@Override
	public ResponseEntity<Customer> update(Customer customer) {
		log.debug("<<<<<<< update customer in impl >>>>>>>",customer);
		return cusResourceApi.updateCustomerUsingPUT(customer);
	}

	@Override
	public ResponseEntity<Freight> save(Freight freight) {
		log.debug("<<<<<<< create freight in impl >>>>>>>",freight);
		return freResourceApi.createFreightUsingPOST(freight);
	}

	@Override
	public ResponseEntity<Freight> update(Freight freight) {
		log.debug("<<<<<<<< update freight in impl >>>>>>>",freight);
		return freResourceApi.updateFreightUsingPUT(freight);
	}

	@Override
	public ResponseEntity<Driver> save(Driver driver) {
		log.debug("<<<<<<<< create driver in impl >>>>>>>",driver);
		return driResourceApi.createDriverUsingPOST(driver);
	}

	@Override
	public ResponseEntity<Driver> update(Driver driver) {
		log.debug("<<<<<<<< update driver in impl >>>>>>>",driver);
		return driResourceApi.updateDriverUsingPUT(driver);
	}

	@Override
	public ResponseEntity<Vehicle> save(Vehicle vehicle) {
		log.debug("<<<<<<<< create vehicle in impl >>>>>>>",vehicle);
		return vehResourceApi.createVehicleUsingPOST(vehicle);
	}

	@Override
	public ResponseEntity<Vehicle> update(Vehicle vehicle) {
		log.debug("<<<<<<<< update vehicle in impl >>>>>>>",vehicle);
		return vehResourceApi.updateVehicleUsingPUT(vehicle);
	}

	@Override
	public ResponseEntity<VehicleLookUp> save(VehicleLookUp vehicleLookUp) {
		log.debug("<<<<<<<< create vehiclelookup in impl >>>>>>>",vehicleLookUp);
		return vehLookUpResourceApi.createVehicleLookUpUsingPOST(vehicleLookUp);
	}

	@Override
	public ResponseEntity<VehicleLookUp> update(VehicleLookUp vehicleLookUp) {
		log.debug("<<<<<<<< update vehiclelookup in impl >>>>>>>",vehicleLookUp);
		return vehLookUpResourceApi.updateVehicleLookUpUsingPUT(vehicleLookUp);
	}

}
