package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;


    @RequestMapping("/value")
    public String passvalue() {
        return demoService.add();
    }

    @PostMapping(path="/savedata")
    public String saveData( @RequestBody Customer customer) {
        System.out.println(customer.getId()+" "+customer.getName());
        return demoService.processData(customer);
    }
}
