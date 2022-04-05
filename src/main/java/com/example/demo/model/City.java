package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class City {
    @Id
    @Column(name = "city_code")
    private int city_code;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "pin")
    private int pin;

    public City(int city_code, String cityName, int pin) {
        this.city_code = city_code;
        this.cityName = cityName;
        this.pin = pin;
    }

    public int getCity_code() {
        return city_code;
    }

    public int getPin() {
        return pin;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCity_code(int city_code) {
        this.city_code = city_code;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
