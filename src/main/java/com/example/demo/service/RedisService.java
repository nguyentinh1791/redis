package com.example.demo.service;

import com.example.demo.model.CustomerDTO;


import java.util.List;
import java.util.Map;


public interface RedisService {

//    List<CustomerDTO> fillAll();

    List<CustomerDTO> findAll();

//    CustomerDTO findCustomerById(Integer id);

    CustomerDTO findById(Integer id);

    void saveCustomer(CustomerDTO ctm);

    String deleteCustomer(Integer id);
}
