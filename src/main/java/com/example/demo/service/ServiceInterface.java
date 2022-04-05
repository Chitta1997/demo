package com.example.demo.service;

import com.example.demo.model.City;

public interface ServiceInterface{
    public City getCityById(int code);
    public void delete(int code);
}
