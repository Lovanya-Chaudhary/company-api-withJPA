package com.rsystems.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.rsystems.springbootstarter.model.Company;

public interface CompanyRepository extends CrudRepository<Company,String> {

}
