package com.example.demo.service;


import com.example.demo.model.CustomerORM;

import java.util.List;

public interface CustomerService {
    List<CustomerORM> getAllUser();
    CustomerORM fillAll();



}
