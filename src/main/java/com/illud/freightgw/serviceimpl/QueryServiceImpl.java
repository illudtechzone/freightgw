package com.illud.freightgw.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;


import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import com.illud.freightgw.client.freight.model.*;
import com.illud.freightgw.service.QueryService;

import io.searchbox.client.JestClient;

@Service
@Transactional
public class QueryServiceImpl implements QueryService{
	
private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);
	
	private final JestClient jestClient;
	private final JestElasticsearchTemplate esTemplate;
	
	public QueryServiceImpl(JestClient jestClient,JestElasticsearchTemplate esTemplate) {
		this.jestClient=jestClient;
		this.esTemplate=esTemplate;
	}

	@Override
	public Company getOneCompany(String companyIdpCode) {
		log.debug("<<<<<< getOne>>>>",companyIdpCode);
		StringQuery sq = new StringQuery(termQuery("iDPCode", companyIdpCode).toString());
		
		return   esTemplate.queryForObject(sq, Company.class);
	}

	@Override
	public Customer getOneCustomer(String customerIdpCode) {
		log.debug("<<<<<< getOne customer >>>>",customerIdpCode);
		StringQuery sq = new StringQuery(termQuery("iDPCode", customerIdpCode).toString());
		return esTemplate.queryForObject(sq, Customer.class);
	}

	@Override
	public Driver getOneDriver(String driverIdpCode) {
		log.debug("<<<<<< getOne driver>>>>",driverIdpCode);
		StringQuery sq =new StringQuery(termQuery("iDPCode",driverIdpCode).toString());
		return esTemplate.queryForObject(sq, Driver.class);
	}
	
	@Override
	public Page<Vehicle> findAllVehiclesByCompanyIdpCode(String companyIdpCode,Pageable pageable) {
		log.debug("<<<<<< getOne driver>>>>",companyIdpCode);
		SearchQuery searchQuery= new NativeSearchQueryBuilder().withQuery(termQuery("company.iDPCode", companyIdpCode)).build();
		return esTemplate.queryForPage(searchQuery, Vehicle.class);
	}
	

}
