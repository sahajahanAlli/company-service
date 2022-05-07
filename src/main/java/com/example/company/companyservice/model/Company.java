package com.example.company.companyservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @Column(name="companyid")
    public String companyid;
    @Column(name="companyname")
    public String companyname;
    @Column(name="gstid")
    public String gstid;
    @Column(name="domainemail")
    public String domainemail;


}
