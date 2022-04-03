package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.DemoRepo;
import com.example.demo.uitl.MyDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoRepo demoRepo;

    @Autowired
    MyDetails myDetails;

    public String processData(Customer customer) {
        System.out.println(customer.getId()+" "+customer.getName());
        return demoRepo.savedata(customer);
    }

    public String add() {
        return "adding";
    }

}
