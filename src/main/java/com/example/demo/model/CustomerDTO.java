package com.example.demo.model;

import lombok.Data;


import java.io.Serializable;

@Data
public class CustomerDTO implements Serializable {

    private Integer id;
    private String name;
    private Integer age;




}
