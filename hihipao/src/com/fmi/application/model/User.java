package com.fmi.application.model;

import com.fmi.application.auth.Authenticable;

import java.util.Date;

public class User implements Authenticable {
    private String firstName;
    private String lastName;
   private Date dateOfBirth;


    private String userName;
    private String hashPassword;

    public User(String firstName, String lastName, Date dateOfBirth, String userName, String hashPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
       // this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.hashPassword = hashPassword;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   /* public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }*/

    @Override
    public String getToken() {
        return Authenticable.DEFAULT_TOKEN;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getHashPassword() {
        return hashPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
               ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}