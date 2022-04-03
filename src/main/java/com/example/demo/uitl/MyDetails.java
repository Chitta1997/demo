package com.example.demo.uitl;

public class MyDetails {
    String Name;
    String age;
    String colleageName;

    public MyDetails() {
    }

    public MyDetails(String name, String age, String colleageName) {
        Name = name;
        this.age = age;
        this.colleageName = colleageName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColleageName() {
        return colleageName;
    }

    public void setColleageName(String colleageName) {
        this.colleageName = colleageName;
    }
}
