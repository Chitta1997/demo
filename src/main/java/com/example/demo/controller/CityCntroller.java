package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<City> getcitybyCode(@PathVariable int code) {
        try {
            return new ResponseEntity<>(cityService.getCityByCode(code), HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }

    @DeleteMapping("/city/{code}")
    public String deleteCity(@PathVariable int code) {
        cityService.delete(code);
        return code + "  deleted";
    }

    @PostMapping("/city")
    public ResponseEntity<String> saveCity(@RequestBody City city) {
        return cityService.saveOrUpdate(city);

    }

    @GetMapping("/cities/{cityName}")
    public List<City> byName(@PathVariable String cityName) {
        return cityService.cities(cityName);
    }

    @GetMapping("/citycode/{cName}")
    //public List<Integer> getPin(@PathVariable String cName){
    public List<Integer> getPin(@PathVariable String cName) {
        System.out.println(mycityname);
        return cityService.citypin(cName);
    }
}
