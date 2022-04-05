package com.example.demo.service;

import com.example.demo.exceptions.CityNotFoundException;
import com.example.demo.model.City;
import com.example.demo.repository.CityRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CityServiceTest {

    @InjectMocks
    CityService cityService;

    @Mock
    CityRepo cityRepo;

    @Test
    public void allcityTest() {
        List<City> list1= new ArrayList<>();
        list1.add(new City(8987,"nnmz",87));
        when(cityRepo.findAll()).thenReturn(list1);
        List<City> list = cityService.allcity();
        assertEquals(list1,list);

    }

    @Test
    public void getCityByCodeTest(){
        int code = 6;
       City city1= new City(897,"ssfdas",90);
      when(cityRepo.findById(Mockito.<Integer>any())).thenReturn(Optional.of(city1));
       City  city= cityService.getCityByCode(code);
        assertEquals(city1,city);
    }

    @Test
    public void getCityByCodeTestException(){
        when(cityRepo.findById(Mockito.<Integer>any())).thenReturn(Optional.empty());
        assertThrows(CityNotFoundException.class, () -> cityService.getCityByCode(6));
    }

    @Test
    public void deleteTest(){
        cityService.delete(355);
    }

    @Test
    public void  citiesTest(){
         List<City> list=new ArrayList< City>( );
        list.add( new City(2322,"bbsr",23));
        String cityname="bbsr1";
        when(cityRepo.getCitiesByCityName(Mockito.<String>any())).thenReturn(list);
        List<City> city = cityService.cities(cityname);
        assertEquals(list,city);
    }

    @Test
    public void citypinTest(){
        String name="acer";
        List<Integer> listInt1= new ArrayList<>();
        listInt1.add(12);
        when(cityRepo.getCityCodeByCityName(Mockito.<String>any())).thenReturn(listInt1);
        List<Integer> listInt=cityService.citypin(name);
        assertEquals(listInt1,listInt);
    }
}
