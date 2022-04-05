package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("frist_priority")
public class ServiceClass1 implements ServiceInterface{
    @Autowired
    CityRepo  cityRepo;
    @Override
    public City getCityById(int code) {
        return cityRepo.findById(code).get();
    }

    @Override
    public void delete(int code) {
    cityRepo.deleteById(code);
    }
}
