package com.rsystems.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsystems.springbootstarter.model.Company;
import com.rsystems.springbootstarter.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	
	
	
	public java.util.List<Company> getAllCompanies()
	{
		
		List<Company> companies=new ArrayList<>();
		companyRepository.findAll().forEach(companies::add);
		return companies;
	}
	
	
	public java.util.Optional<Company> getCompany(String id)
	{
		//return(Company)companies.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return companyRepository.findById(id); 
	}

	
	public void addCompany(Company company) {
		companyRepository.save(company);
		
	}

	public void updateCompany(Company company, String id) {
		companyRepository.save(company);
		
	}

	public void deleteCompany(String id) {
		companyRepository.deleteById(id);
		
	}
	
	

}