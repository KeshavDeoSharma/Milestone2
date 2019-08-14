package com.keshav.SpringBootExample.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keshav.SpringBootExample.model.*;
import com.keshav.SpringBootExample.dao.CompanyDao;
import com.keshav.SpringBootExample.dao.CompanyDaoImpl;
import com.keshav.SpringBootExample.dao.SectorDao;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	@Autowired
	private SectorDao sectorDao;
	

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  List<Company> getCompanyList() throws SQLException {
		return companyDao.findAll();
	}

	@Override
	public Company insertCompany(Company company) {
	
		return companyDao.save(company);
	}

	@Override
	public List<Sector> getSectorList() {
		// TODO Auto-generated method stub
		return sectorDao.findAll();
	}
	

}
