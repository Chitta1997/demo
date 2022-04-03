package com.example.demo.experiment;

public class Department {
    int deptid;
    String deptName;

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void itsAddress(Address adr){
        System.out.println(adr.getPinno()+" "+adr.getStreet1());
    }
}
