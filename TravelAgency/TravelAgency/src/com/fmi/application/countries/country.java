//package com.fmi.application.countries;

package p;

import com.fmi.application.cities.Cities;

import java.util.ArrayList;

public class country {
    private String name;
    private String capital;
    private String climate;
    private ArrayList<Cities> listCities;
    public country(String name,String capital,String climate,ArrayList<Cities> listCities)
    {   this.name=name;
        this.capital=capital;
        this.capital=capital;
        this.listCities=new ArrayList<Cities>();}
    public country(){}


    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public ArrayList<Cities> getListCities() {
        return listCities;
    }

    public void setListCities(ArrayList<Cities> listCities) {
        this.listCities = listCities;
    }

    public void setName(String name) {
        this.name = name;
    }


}
