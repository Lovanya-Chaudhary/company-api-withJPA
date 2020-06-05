package com.rsystems.springbootstarter.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Company {

	@Id
	@ApiModelProperty(notes = "Id of the Company",name="id",required=true,value="test id")
	//@JsonProperty("id")
	private String id;
	
	@ApiModelProperty(notes = "Name of the Company",name="companyName",required=true,value="test name")
	//@JsonProperty("name")
	private String companyName;
	
	@ApiModelProperty(notes = "Location of the Company",name="companyLocation",required=true,value="test location")
	//@JsonProperty("email")
	private String companyLocation;
	
	public Company(){
		
	}
	
	
	public Company(String id,String companyName,String companyLocation)
	{
		this.id=id;
		this.companyName=companyName;
		this.companyLocation=companyLocation;
	}
	
	public String getId()
	{
		return id;
	}
	
	
	public void setId(String id)
	{
		this.id=id;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	
	public String getCompanyLocation()
	{
		return companyLocation;
	}
	
	public void setCompanyLocation(String companyLocation)
	{
		this.companyLocation=companyLocation;
	}


	
	
	
}
