package com.example.demo.controller;

import com.example.demo.model.CustomerDTO;
import com.example.demo.service.impl.RedisServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RedisController {
    @Resource
    RedisServiceImpl redisService;

    private final String hashReference = "Customer";

    @GetMapping("/getAllCustomer")
    public List<CustomerDTO> fillAll() {
        return redisService.findAll();
    }

    @GetMapping("/findById/{id}")
    public CustomerDTO findCustomerById(@PathVariable Integer id) {
        return redisService.findById(id);
    }

    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody CustomerDTO ctm) {
        redisService.saveCustomer(ctm);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        return redisService.deleteCustomer(id);
    }
}
