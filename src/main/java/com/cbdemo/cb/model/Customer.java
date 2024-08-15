package com.cbdemo.cb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document

public class Customer {

    @Id
    private int id;
    private String custName;
    private String custAddress;

    public Customer() {
        super();
    }

    public Customer(int id, String custName, String custAddress) {
        this.id = id;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }




}
