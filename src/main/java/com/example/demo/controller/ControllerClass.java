package com.example.demo.controller;

import com.example.demo.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerClass {
    @Autowired
    @Qualifier("frist_priority")
    ServiceInterface serviceInterface;
}
