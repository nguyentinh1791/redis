package com.example.demo.controller;


import com.example.demo.model.CustomerORM;
import com.example.demo.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;


    @CrossOrigin(origins = "*")

    @GetMapping("/getAllUser")
    List<CustomerORM> getAllUser(){

        return customerService.getAllUser();
    }

}
