package com.fmi.application.forms;

import com.fmi.application.deals.deals;

public class payment implements form {
    private String CNP;
    private String LastName;
    private String FirstName;
    private deals CountryOffer;
    private String UserName;
    private int price;

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Override
    public deals getCountryOffer() {
        return CountryOffer;
    }

    public void setCountryOffer(deals countryOffer) {
        CountryOffer = countryOffer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }







}

