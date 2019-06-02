package com.fmi.application.forms;

import com.fmi.application.deals.deals;


public class wishListform implements form {
    private String CNP;
    private String LastName;
    private String FirstName;
    private deals CountryOffer;
    private String UserName;
   private deals Price;
    private deals days;


    @Override
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

    @Override
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public deals getPrice() {
        return Price;
    }

    public void setPrice(deals price) {
        Price = price;
    }

    public deals getDays() {
        return days;
    }

    public void setDays(deals days) {
        this.days = days;
    }

    public wishListform(String CNP, String lastName, String firstName, deals countryOffer, String userName, deals price, deals days) {
        this.CNP = CNP;
        LastName = lastName;
        FirstName = firstName;
        CountryOffer = countryOffer;
        UserName = userName;
        Price = price;
        this.days = days;
    }
}

