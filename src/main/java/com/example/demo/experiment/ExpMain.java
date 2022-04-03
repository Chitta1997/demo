package com.example.demo.experiment;

public class ExpMain {

    public static void main(String args[]){
        Employee emp = new Employee();
       // emp.displayEmp(null);
        Employee emp1 = new Employee(new Department());
        emp1.displayEmp(new Address());
    }
}

