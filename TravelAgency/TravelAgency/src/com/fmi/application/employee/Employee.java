/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmi.application.employee;


import com.fmi.application.model.User;

import java.util.Date;

/**
 *
 * @author User
 */
public class Employee extends User{
    private EmployeeDetails employeeDetails;

    public Employee(String firstName, String lastName, Date dateOfBirth, String userName, String hashPassword, EmployeeDetails employeeDetails) {
        super(firstName, lastName, dateOfBirth, userName, hashPassword);
        this.employeeDetails = employeeDetails;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }
}
