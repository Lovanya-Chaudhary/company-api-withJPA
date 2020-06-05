package com.rsystems.springbootstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rsystems.springbootstarter.model.Company;
import com.rsystems.springbootstarter.service.CompanyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="CompanyController",description = "REST Api related to Company Entity!!!!")
@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@ApiOperation(value = "Get list of Companies in the System ", response = Company.class, tags = "companies")
	@RequestMapping("/companies")
	public ResponseEntity<Object> getAllcompanies()
	{
		
		return new ResponseEntity<>(companyService.getAllCompanies(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Get specific Company from the System ", response = Company.class, tags = "companies")
	@RequestMapping("/companies/{id}")
	public ResponseEntity<Object> getCompany(@PathVariable String id) {
	      return new ResponseEntity<>(companyService.getCompany(id), HttpStatus.OK);
	   }
	
	
	@ApiOperation(value = "Set specific Company in the System ", response = Company.class, tags = "companies")
	@RequestMapping(method=RequestMethod.POST,value="/companies")
	public ResponseEntity<Object> addCompany(@RequestBody Company company) {
	      companyService.addCompany(company);
	      return new ResponseEntity<>("Company is created successfully", HttpStatus.CREATED);
	   }
	
	
	@ApiOperation(value = "Update specific Company in the System ", response = Company.class, tags = "companies")
	@RequestMapping(method=RequestMethod.PUT,value="/companies/{id}")
	public ResponseEntity<Object> updateCompany(@RequestBody Company company,@PathVariable String id) { 
	      companyService.updateCompany(company,id);
	      return new ResponseEntity<>("Company is updated successsfully", HttpStatus.OK);
	   }  
	
	@ApiOperation(value = "Delete specific Company in the System ", response = Company.class, tags = "companies")
	@RequestMapping(method=RequestMethod.DELETE,value="/companies/{id}")
	public ResponseEntity<Object> deleteCompany(@PathVariable String id) { 
	      companyService.deleteCompany(id);
	      return new ResponseEntity<>("Company is deleted successsfully", HttpStatus.OK);
	   }

}