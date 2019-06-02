/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmi.application.client;
import com.fmi.application.model.User;

import java.util.Date;

/**
 *
 * @author User
 */
public class Customer extends User{
    private CustomerDetails customerDetails;

    public Customer(String firstName, String lastName, Date dateOfBirth, String userName, String hashPassword, CustomerDetails customerDetails) {
        super(firstName, lastName, dateOfBirth, userName, hashPassword);
        this.customerDetails = customerDetails;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }
    
}
