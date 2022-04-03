package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class DemoRepo {

    public String savedata(Customer customer){
        System.out.println(customer.getId()+" "+customer.getName());
       return "created";
    }
}
