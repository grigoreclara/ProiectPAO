/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmi.application.client;
import java.util.Date;

/**
 *
 * @author User
 */
public class CustomerDetails {
    private String location;
    private String cnp;
    private Date dateOfBirth;
    private String emailAddress;
    private String phoneNumber;
    private String nameclient;
    private String pren;

    public String getName() {
        return nameclient;
    }

    public void setName(String name) {
        this.nameclient = nameclient;
    }

    public String getPren() {
        return pren;
    }

    public void setPren(String pren) {
        this.pren = pren;
    }

    public CustomerDetails(String location, String cnp, Date dateOfBirth, String emailAddress, String phoneNumber, String nameclient, String pren) {
        this.location = location;
        this.cnp = cnp;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        this.nameclient=nameclient;
        this.pren=pren;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
        
    }
    
    public String getemailAddress() {
        return emailAddress;
    }

    public void setemailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public void afisareInfoClient() {

        System.out.println("Nume: " + nameclient + "\nData nasterii: " + dateOfBirth +  "\nAdresa: " + location +"\nCNP : " + cnp);

    }
}

