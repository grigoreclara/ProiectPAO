package com.fmi.application.hotels;

public class hotels {
    private String name;
    private int numberOfrooms;
    private String  nameAdministrator;
    private String numberPhone;
    private int levels;
    private int stars;
    private String country;



    public hotels(String name, String nameAdministrator, String numberPhone, int stars , int levels, int numberOfrooms,String country)
    {this.name=name;
    this.nameAdministrator=nameAdministrator;
    this.numberPhone=numberPhone;
    this.stars=stars;
    this.levels=levels;
    this.numberOfrooms=numberOfrooms;
    this.country=country;}



  public hotels(){

  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfrooms() {
        return numberOfrooms;
    }

    public void setNumberOfrooms(int numberOfrooms) {
        this.numberOfrooms = numberOfrooms;
    }

    public String getNameAdministrator() {
        return nameAdministrator;
    }

    public void setNameAdministrator(String nameAdministrator) {
        this.nameAdministrator = nameAdministrator;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}