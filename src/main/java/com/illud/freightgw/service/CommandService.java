package com.illud.freightgw.service;

import org.springframework.http.ResponseEntity;


import com.illud.freightgw.client.freight.model.*;

public interface CommandService {
	ResponseEntity<CompanyDTO> update(CompanyDTO company);

	//ResponseEntity<Company> save(Company company);

	ResponseEntity<CustomerDTO> save(CustomerDTO customer);

	ResponseEntity<CustomerDTO> update(CustomerDTO customer);

	

	ResponseEntity<FreightDTO> update(FreightDTO freight);

	ResponseEntity<DriverDTO> save(DriverDTO driver);

	ResponseEntity<DriverDTO> update(DriverDTO driver);

	ResponseEntity<VehicleDTO> save(VehicleDTO vehicle);

	ResponseEntity<VehicleDTO> update(VehicleDTO vehicle);

	ResponseEntity<VehicleLookUpDTO> save(VehicleLookUpDTO vehicleLookUp);

	ResponseEntity<VehicleLookUpDTO> update(VehicleLookUpDTO vehicleLookUp);

	ResponseEntity<CompanyDTO> createcompanyIfnotExist(CompanyDTO companyDTO);

	ResponseEntity<CustomerDTO> createcustomerIfnotExist(CustomerDTO customerDTO);

	ResponseEntity<DriverDTO> createdriverIfnotExist(DriverDTO driverDTO);

///////////////////////////activiti-workflow///////////////////////////////////
	
	ResponseEntity<FreightDTO> save(FreightDTO freight);

	void sendQuatation(String taskId, QuotationDTO response);

	void customerStatus(String taskId, CustomerStatus customerStatus);

	void deleteVehicle(Long vehicleId);
	
	void deleteVehicleLookup(Long vehicleLookupId);

	ResponseEntity<FreightDTO> createAssignVehicle(FreightDTO freightDTO, Long vehicleId);

	void deleteDriver(Long driverId);

}
