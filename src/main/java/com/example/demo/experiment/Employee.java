package com.example.demo.experiment;

public class Employee {
    Department dept;

    Employee(Department dept) {
        this.dept = dept;
    }

    Employee() {

    }

    public String displayEmp(Address adr) {
        System.out.println(adr.display());
        dept.itsAddress(adr);
        return "emp display";
    }

}
