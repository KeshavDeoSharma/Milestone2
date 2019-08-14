package com.keshav.SpringBootExample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.keshav.SpringBootExample.model.Company;
import com.keshav.SpringBootExample.model.Sector;

@Repository
public abstract class CompanyDaoImpl implements CompanyDao{

	
	
	public List<Company> getCompanyList() throws SQLException {
		List <Company> companyList=new ArrayList<Company>();
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			 company=new Company();
			 int companyId=rs.getInt("company_code");
			company.setCompanyId(companyId);;
			company.setBoardOfDirectors(rs.getString("boardofdirectors"));
			company.setBreifwriteup(rs.getString("breifwriteup"));
			company.setSectorid(rs.getInt("sector_id"));
company.setCeo(rs.getString("ceo"));
company.setCompanyname(rs.getString("company_Name"));
company.setStock_code(rs.getInt("stock_code"));
company.setTurnover(rs.getInt("turnover"));

			companyList.add(company);
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return companyList;
	}
	@Override
	public Company insertCompany(Company company)
	{
		int rs=0;
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","pass@word1");
			PreparedStatement ps=conn.prepareStatement("insert into company values(?,?,?,?,?,?,?,?)");
			Random random=new Random();
			int i=random.nextInt(85000)+10000;
			ps.setInt(1, i);
			ps.setString(2, company.getCompanyname());
			ps.setInt(3,company.getTurnover());
			ps.setString(4,company.getCeo());
			ps.setString(5,company.getBoardOfDirectors());
			ps.setInt(6,company.getSectorid());
			ps.setString(7,company.getBreifwriteup());
			ps.setInt(8,company.getStock_code());
			 rs=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
	if(rs!=0)
	{
		System.out.println("Successfully added inthe companyList");
		return company;
		
	}
	else {
		System.out.println("Not added");
		return company;
	}

	}
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	@Override
	public List<Sector> getSectorList()
	{
		List<Sector> listSector=new ArrayList<Sector>();
		
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","pass@word1");
		PreparedStatement ps=conn.prepareStatement("select * from sectors");
		ResultSet rs=	ps.executeQuery();
		Sector sector=null;
		while(rs.next()){
			 sector=new Sector();
			 sector.setSectorid(rs.getInt("id"));
			 listSector.add(sector);
			 System.out.println(sector.getSectorid());
			 
		
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return listSector;
	}
	}


