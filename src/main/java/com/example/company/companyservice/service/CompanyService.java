package com.example.company.companyservice.service;

import com.example.company.companyservice.model.Company;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CompanyService {

   public List<Company> getCompanies();
   public Company saveCompany(Company com);
   public Company getCompany( String cmpId);
   public Company searchCompanyByName(String cmpName);

}
