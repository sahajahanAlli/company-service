package com.example.company.companyservice.controller;

import com.example.company.companyservice.model.Company;
import com.example.company.companyservice.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.company.companyservice.constants.APIConstants;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = APIConstants.COMPANY_PATH)
public class CompanyController {

    private CompanyService companyService;


    @GetMapping
    public ResponseEntity<List<Company>> getCompanies(){
        return ResponseEntity.ok( companyService.getCompanies());
    }

    @PostMapping
    public ResponseEntity<Company> addCompany(@RequestBody Company compData){
        return ResponseEntity.status(201).body(companyService.saveCompany(compData));
    }

    @GetMapping(value=APIConstants.COMPANY_ID)
    public ResponseEntity<Company> getCompany(@PathVariable("id") String cmpId){
        return ResponseEntity.ok(companyService.getCompany(cmpId));
    }

    @GetMapping(value="/companydetails")
    public ResponseEntity<Company> getCompanyByName(@RequestParam(value ="companyname") String cmpname){
        return ResponseEntity.ok(companyService.searchCompanyByName(cmpname));
    }
}
