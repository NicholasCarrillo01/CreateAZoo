package com.company.people;

import java.util.ArrayList;
import java.util.List;

public class Employee extends People{

private int workID;
private int    hours;
private String jobTitle;
private String hireDate;


   private List<Employee> employeeList = new ArrayList<Employee>();

    
    public Employee(int age, String name, char gender, String race, int workID, String jobTitle, String hireDate) {
        super(age, name, gender, race);
        this.workID = workID;

        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
    }

    public int getWorkID() {
        return workID;
    }

    public void setWorkID(int workID) {
        this.workID = workID;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void addEmployee (Employee newEmployee) {
        employeeList.add(newEmployee);
        System.out.println(newEmployee.getName)
    }



}
