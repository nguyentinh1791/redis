package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "customer")
@Data
public class CustomerORM {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer age;

}
