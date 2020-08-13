package com.cispring.dockerci.controller;

import com.cispring.dockerci.model.Customers;
import com.cispring.dockerci.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/customers")
public class CustomerController {

    @Autowired
    CustomersRepository customersRepository;

    @GetMapping(value = "/all")
    public List<Customers> getAll(){
        return customersRepository.findAll();
    }

    @PostMapping(value = "/load")
    public  List<Customers> persist(@RequestBody final Customers customers){
        customersRepository.save(customers);
        return customersRepository.findAll();
    }
}
