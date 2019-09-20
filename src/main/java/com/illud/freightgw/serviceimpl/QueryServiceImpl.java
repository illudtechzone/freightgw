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
	public Company getOneCompany(String iDPCode) {
		log.debug("<<<<<< getOne>>>>",iDPCode);
		StringQuery sq = new StringQuery(termQuery("companyIdpCode", iDPCode).toString());
		
		return   esTemplate.queryForObject(sq, Company.class);
	}

	@Override
	public Customer getOneCustomer(String iDPCode) {
		log.debug("<<<<<< getOne customer >>>>",iDPCode);
		StringQuery sq = new StringQuery(termQuery("customerIdpCode", iDPCode).toString());
		return esTemplate.queryForObject(sq, Customer.class);
	}

	@Override
	public Driver getOneDriver(String iDPCode) {
		log.debug("<<<<<< getOne driver>>>>",iDPCode);
		StringQuery sq =new StringQuery(termQuery("driverIdpCode",iDPCode).toString());
		return esTemplate.queryForObject(sq, Driver.class);
	}
	
	@Override
	public Page<Vehicle> findAllVehiclesByCompanyIdpCode(String iDPCode,Pageable page) {
		log.debug("<<<<<< getOne driver>>>>",iDPCode);
		SearchQuery searchQuery= new NativeSearchQueryBuilder().withQuery(termQuery("company.companyIdpCode", iDPCode)).build();
		return esTemplate.queryForPage(searchQuery, Vehicle.class);
	}
	

}
