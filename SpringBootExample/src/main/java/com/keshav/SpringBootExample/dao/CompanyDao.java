package com.keshav.SpringBootExample.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keshav.SpringBootExample.model.*;
@Repository
public interface CompanyDao extends JpaRepository<Company, Integer>{
	
	  //public CompanyDao insertCompany(Company company) throws SQLException;
	    /*public Company updateCompany(Company company);
		public List<Company> getCompanyList() throws SQLException;
		public Company insertCompany(Company company);
		public List<Sector> getSectorList();
*/
}
