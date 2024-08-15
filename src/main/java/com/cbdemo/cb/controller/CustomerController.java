package com.cbdemo.cb.controller;


import com.cbdemo.cb.model.Customer;
import com.cbdemo.cb.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "Data added successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAll(){
        return customerRepo.findAll();
    }
}
