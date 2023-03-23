package com.example.demo.responsitory;


import com.example.demo.model.CustomerORM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerReponsitory extends CrudRepository<CustomerORM, String> {
//    List<CustomerDTO> findByName(String name);
//    CustomerDTO findById(long id);

}
