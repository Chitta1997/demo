package com.example.demo.experiment;

class Address{
    String street1;
    int pinno;

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public int getPinno() {
        return pinno;
    }

    public void setPinno(int pinno) {
        this.pinno = pinno;
    }

    public String display(){
        return street1;
    }
}