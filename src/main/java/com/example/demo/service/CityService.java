package com.example.demo.service;

import com.example.demo.exceptions.CityNotFoundException;
import com.example.demo.model.City;
import com.example.demo.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    CityRepo cityRepo;

    public List<City> allcity() {
        List<City> cityList = new ArrayList<>();
        Iterable<City> cities = cityRepo.findAll();
        Iterator<City> iterator = cities.iterator();
        while (iterator.hasNext()) {
            cityList.add(iterator.next());
        }
        return cityList;
    }

    public City getCityByCode(int code) {
        Optional<City> optionalCity = cityRepo.findById(code);
        if (!optionalCity.isPresent()) {
            throw new CityNotFoundException("City not found");
        }
        return cityRepo.findById(code).get();
    }

    public ResponseEntity<String> saveOrUpdate(City city) {
        if(city.getCityName()== null ||city.getCityName().isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("enter city name");
        }
        cityRepo.save(city);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Request accepted");
    }

    public void delete(int code) {

        cityRepo.deleteById(code);
    }

    public List<City> cities(String cityName) {
        return cityRepo.getCitiesByCityName(cityName);
    }

    public List<Integer> citypin(String cName) {
        return cityRepo.getCityCodeByCityName(cName);
    }


}
