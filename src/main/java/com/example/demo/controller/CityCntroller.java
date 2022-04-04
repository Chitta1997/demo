package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityCntroller {

    @Value("${my.name:myDefaultCity}")
    private String mycityname;

    @Autowired
    CityService cityService;

    @GetMapping("/allcity")
    public List<City> cityDetails() {
        return cityService.allcity();
    }

    @GetMapping("/city/{code}")
    public City getcitybyCode(@PathVariable int code) {
        return cityService.getCityByCode(code);
    }

    @DeleteMapping("/city/{code}")
    public String deleteCity(@PathVariable int code) {
        cityService.delete(code);
        return code+"  deleted";
    }

    @PostMapping("/city")
    public String saveCity(@RequestBody City city) {
      return  cityService.saveOrUpdate(city).getCityName() +" City saved successfully";

    }
    @GetMapping("/cities/{cityName}")
    public List<City> byName(@PathVariable String cityName){
        return cityService.cities(cityName);
    }
    
    @GetMapping("/citycode/{cName}")
    //public List<Integer> getPin(@PathVariable String cName){
    public List<Integer> getPin(@PathVariable String cName){
        System.out.println(mycityname);
        return cityService.citypin(cName);
    }
}
