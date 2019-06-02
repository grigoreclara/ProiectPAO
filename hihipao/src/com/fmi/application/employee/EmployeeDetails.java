/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmi.application.employee;
import java.util.Date;

/**
 *
 * @author User
 */
public class EmployeeDetails {
    private int Salary;
    private String function;
    private String department;
    private String cnp;
    private Date DateOfBirth;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDetails(int Salary, String function, String department, String cnp, Date DateOfBirth, String name) {
        this.Salary = Salary;
        this.function = function;
        this.cnp = cnp;
        this.department = department;
        this.DateOfBirth = DateOfBirth;
        this.name=name;

    }

    public String getCnp() {
        return cnp;
    }



    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getfunction() {
        return function;
    }

    public void setfunction(String function) {
        this.function = function;
    }

    public String getdepartment() {
        return department;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }


    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }


    public void afisareInfo() {

        System.out.println("Nume: " + name + "\nData: " + DateOfBirth + "\nSalariu: " + Salary + "\nDepartament: " + department + "\nFunctie: " + function);

    }
}