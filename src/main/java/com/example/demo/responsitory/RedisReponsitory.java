package com.example.demo.responsitory;

import com.example.demo.model.CustomerDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisReponsitory extends CrudRepository<CustomerDTO, String> {
}
