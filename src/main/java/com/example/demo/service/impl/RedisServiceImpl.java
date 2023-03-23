package com.example.demo.service.impl;

import com.example.demo.model.CustomerDTO;
import com.example.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisServiceImpl implements RedisService {
    private final String hashReference = "Customer1";

    @Autowired
    RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;

    public RedisServiceImpl(RedisTemplate redisTemplate) {
        this.hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public List<CustomerDTO> findAll() {
        return hashOperations.values(hashReference);
    }

    @Override
    public CustomerDTO findById(final Integer id) {
        return (CustomerDTO) hashOperations.get(hashReference, id);
    }

    @Override
    public void saveCustomer(CustomerDTO ctm) {
        hashOperations.put(hashReference, ctm.getId(), ctm);
    }

    @Override
    public String deleteCustomer(Integer id) {
        hashOperations.delete(hashReference, id);
        return "customer remove!!";
    }

}
