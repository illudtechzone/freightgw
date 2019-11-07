package com.illud.freightgw.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.illud.freightgw.client.freight.api.CommandResourceApi;
import com.illud.freightgw.client.freight.api.CompanyResourceApi;
import com.illud.freightgw.client.freight.api.CustomerResourceApi;
import com.illud.freightgw.client.freight.api.DriverResourceApi;
import com.illud.freightgw.client.freight.api.FreightResourceApi;
import com.illud.freightgw.client.freight.api.QuotationResourceApi;
import com.illud.freightgw.client.freight.api.VehicleLookUpResourceApi;
import com.illud.freightgw.client.freight.api.VehicleResourceApi;
import com.illud.freightgw.client.freight.api.VehicleStaffResourceApi;
import com.illud.freightgw.client.freight.model.*;

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
	@Autowired
	CommandResourceApi commandResourceApi;
	@Autowired
    private SimpMessagingTemplate messageSender;
	@Autowired
	private QuotationResourceApi quotResApi; 
	@Autowired
	QueryServiceImpl queryServiceImpl;
	@Autowired
	VehicleStaffResourceApi vehStaffResourceApi;
	
	

	@Override
	public ResponseEntity<CompanyDTO> update(CompanyDTO company) {
		log.debug("<<<<<< update >>>>>>",company);
		return comResourceApi.updateCompanyUsingPUT(company);
	}

	/*
	 * @Override public ResponseEntity<Company> save(Company company) {
	 * log.debug("<<<<<< create company in impl >>>>>>",company); return
	 * comResourceApi.createCompanyUsingPOST(company); }
	 */

	@Override
	public ResponseEntity<CustomerDTO> save(CustomerDTO customer) {
		log.debug("<<<<<< create customer in impl >>>>>>",customer);
		return cusResourceApi.createCustomerUsingPOST(customer);
	}

	@Override
	public ResponseEntity<CustomerDTO> update(CustomerDTO customer) {
		log.debug("<<<<<<< update customer in impl >>>>>>>",customer);
		return cusResourceApi.updateCustomerUsingPUT(customer);
	}

	

	@Override
	public ResponseEntity<FreightDTO> update(FreightDTO freight) {
		log.debug("<<<<<<<< update freight in impl >>>>>>>",freight);
		return freResourceApi.updateFreightUsingPUT(freight);
	}

	@Override
	public ResponseEntity<DriverDTO> save(DriverDTO driver) {
		log.debug("<<<<<<<< create driver in impl >>>>>>>",driver);
		return driResourceApi.createDriverUsingPOST(driver);
	}

	@Override
	public ResponseEntity<DriverDTO> update(DriverDTO driver) {
		log.debug("<<<<<<<< update driver in impl >>>>>>>",driver);
		return driResourceApi.updateDriverUsingPUT(driver);
	}

	@Override
	public ResponseEntity<VehicleDTO> save(VehicleDTO vehicle) {
		log.debug("<<<<<<<< create vehicle in impl >>>>>>>",vehicle);
		return vehResourceApi.createVehicleUsingPOST(vehicle);
	}

	@Override
	public ResponseEntity<VehicleDTO> update(VehicleDTO vehicle) {
		log.debug("<<<<<<<< update vehicle in impl >>>>>>>",vehicle);
		return vehResourceApi.updateVehicleUsingPUT(vehicle);
	}

	@Override
	public ResponseEntity<VehicleLookUpDTO> save(VehicleLookUpDTO vehicleLookUp) {
		log.debug("<<<<<<<< create vehiclelookup in impl >>>>>>>",vehicleLookUp);
		return vehLookUpResourceApi.createVehicleLookUpUsingPOST(vehicleLookUp);
	}

	@Override
	public ResponseEntity<VehicleLookUpDTO> update(VehicleLookUpDTO vehicleLookUp) {
		log.debug("<<<<<<<< update vehiclelookup in impl >>>>>>>",vehicleLookUp);
		return vehLookUpResourceApi.updateVehicleLookUpUsingPUT(vehicleLookUp);
	}

	@Override
	public ResponseEntity<CompanyDTO> createcompanyIfnotExist(CompanyDTO companyDTO) {
		log.debug("<<<<<<<< create company if not exist>>>>>>>>",companyDTO);
		return comResourceApi.createCompanyIfNotExistUsingPOST(companyDTO);
	}

	@Override
	public ResponseEntity<CustomerDTO> createcustomerIfnotExist(CustomerDTO customerDTO) {
		log.debug("<<<<<<<< create customer if not exist >>>>>>>",customerDTO);
		return cusResourceApi.createcustomerIfnotExistUsingPOST(customerDTO);
	}

	@Override
	public ResponseEntity<DriverDTO> createdriverIfnotExist(DriverDTO driverDTO) {
		log.debug("<<<<<< create driver if not ot exist >>>>>>",driverDTO);
		return driResourceApi.createdriverIfnotExistUsingPOST(driverDTO);
	}

	@Override
	public ResponseEntity<VehicleStaffDTO> createVehicleStaff(VehicleStaffDTO vehStaffDTO) {
		log.debug("<<<<<< createVehicleStaff >>>>>>>",vehStaffDTO);
		return vehStaffResourceApi.createVehicleStaffUsingPOST(vehStaffDTO);
	}
	@Override
	public ResponseEntity<VehicleStaffDTO> updateVehicleStaff(VehicleStaffDTO vehStaffDTO) {
		log.debug("<<<<<< updateVehicleStaff >>>>>>>",vehStaffDTO);
		return vehStaffResourceApi.updateVehicleStaffUsingPUT(vehStaffDTO);
	}
	
	/*
	 * @Override public ResponseEntity<VehicleStaffDTO> assignStaffForDriver(Long
	 * staffId, Long vehicleId) { log.debug("<<<<<<<< assignStaffForDriver >>>>>>" +
	 * "vehicleID" + vehicleId + "staffid" + staffId); // // return
	 * vehStaffResourceApi.assignVehicleStaffForDriverUsingPOST(staffId, vehicleId);
	 * }
	 */
	 	
///////////////////////////activiti-workflow///////////////////////////////////

	@Override
	public ResponseEntity<FreightDTO> save(FreightDTO freight) {
		log.debug("<<<<<<< create freight in impl >>>>>>>",freight);
		 ResponseEntity<FreightDTO>  fdto=freResourceApi.createFreightUsingPOST(freight);
		messageSender.convertAndSend("/topic/freight", fdto.getBody());
		 return fdto;
	}

	@Override
	public void sendQuatation(String taskId, QuotationDTO response) {
//		commandResourceApi.sendQuatationUsingPOST(taskId, response);
		
	}

	@Override
	public void customerStatus(String taskId, CustomerStatus customerStatus) {
		
		commandResourceApi.statusUsingPOST(taskId, customerStatus);
	}

	@Override
	public void deleteVehicle(Long vehicleId) {
	
		this.vehResourceApi.deleteVehicleUsingDELETE(vehicleId);
		
	}

	@Override
	public void deleteVehicleLookup(Long vehicleLookupId) {
		
		this.vehLookUpResourceApi.deleteVehicleLookUpUsingDELETE(vehicleLookupId);
		
	}

	@Override
	public ResponseEntity<FreightDTO> createAssignVehicle(FreightDTO freightDTO, Long vehicleId) {
		log.debug("<<<<< createAssignVehicle >>>>>>",freightDTO,vehicleId);
		return freResourceApi.assignVehicleUsingPOST(vehicleId, freightDTO);
	}

	@Override
	public void deleteDriver(Long driverId) {
		log.debug("<<< delete driver >>>>",driverId);
		this.driResourceApi.deleteDriverUsingDELETE(driverId);
	}

	@Override
	public ResponseEntity<QuotationDTO> save(QuotationDTO quotationDTO) {
		ResponseEntity<QuotationDTO> savedQuotationDTO=quotResApi.createQuotationUsingPOST(quotationDTO);
		
		ResponseEntity<FreightDTO> freightDTO=queryServiceImpl.findFreightId(savedQuotationDTO.getBody().getFreightId());
		
		ResponseEntity<CustomerDTO> customer = queryServiceImpl.findCustomerById(freightDTO.getBody().getCustomerId());
		messageSender.convertAndSendToUser(customer.getBody().getCustomerIdpCode(), "/topic/quotes",savedQuotationDTO );
		return savedQuotationDTO;
	}
	
	
	public ResponseEntity<QuotationDTO> update(QuotationDTO quotationDTO) {
		log.debug("<<<<< update quotation >>>",quotationDTO);
		return quotResApi.updateQuotationUsingPUT(quotationDTO);

	}





	
	

}