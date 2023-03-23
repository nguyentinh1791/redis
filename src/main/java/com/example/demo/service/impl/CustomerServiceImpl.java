package com.example.demo.service.impl;

import com.example.demo.model.CustomerORM;
import com.example.demo.responsitory.CustomerReponsitory;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerReponsitory customerReponsitory;

    @Override
    public CustomerORM fillAll() {
        return null;
    }
    @Override
    public List<CustomerORM> getAllUser() {
        return (List<CustomerORM>) customerReponsitory.findAll();
    }


}
