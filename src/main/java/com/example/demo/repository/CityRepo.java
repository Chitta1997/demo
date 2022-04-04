package com.example.demo.repository;

import com.example.demo.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepo extends CrudRepository<City,Integer> {
    List<City> getCitiesByCityName(String cityName);

//here City sholuld be same as Entity class
    @Query("SELECT city_code  FROM City where cityName=:cName ")
    List<Integer> getCityCodeByCityName(String cName);
}
