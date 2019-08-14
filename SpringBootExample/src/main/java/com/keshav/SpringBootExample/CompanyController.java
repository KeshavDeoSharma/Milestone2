package com.keshav.SpringBootExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.keshav.SpringBootExample.model.Company;
import com.keshav.SpringBootExample.service.CompanyService;


@Controller
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String m1(ModelMap model)
	{
		//System.out.println("screen message from method");
		Company company=new Company();
		model.addAttribute("company",company);
		model.addAttribute("sectorList", companyService.getSectorList());
	return "addCompany";
		
	}
	@RequestMapping(value="/submitCompany",method=RequestMethod.POST)
	public String addCompany(Company company)
	{
				if(companyService.insertCompany(company)!=null) {
					return "redirect:/listCompany";
				}
				else
		
		return "redirect:/";
		}
	@RequestMapping(path="/listCompany")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}
	
}
