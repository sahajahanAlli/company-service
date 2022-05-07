package com.example.company.companyservice.repository;

import com.example.company.companyservice.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRespository extends JpaRepository<Company,Long> {

    Company findByCompanyid(String cmpid);
    Company findByCompanyname(String cmpname);

    /*
    *
    * List<Laptop> findByName(String name);

	List<Laptop> findByBrand(String name);

	List<Laptop> findByPrice(BigDecimal price);
    * */
}
