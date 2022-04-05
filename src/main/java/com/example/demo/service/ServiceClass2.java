package com.example.demo.service;

import com.example.demo.model.City;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("second_priority")

public class ServiceClass2 implements ServiceInterface{
    @Override
    public City getCityById(int code) {
        return null;
    }

    @Override
    public void delete(int code) {

    }
}
