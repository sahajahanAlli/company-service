package com.example.company.companyservice.service;

import com.example.company.companyservice.model.Company;
import com.example.company.companyservice.repository.CompanyRespository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CompanyServiceImpl implements CompanyService{

    private CompanyRespository companyRespository;

    @Override
    public List<Company> getCompanies() {
        return companyRespository.findAll();
    }

    @Override
    public Company saveCompany(Company com) {
        System.out.println("data->"+com.toString());
        return companyRespository.save(com);
    }

    @Override
    public Company getCompany(String cmpId) {
        return companyRespository.findByCompanyid(cmpId);
    }

    @Override
    public Company searchCompanyByName(String cmpName) {
        return companyRespository.findByCompanyname(cmpName);
    }
}
