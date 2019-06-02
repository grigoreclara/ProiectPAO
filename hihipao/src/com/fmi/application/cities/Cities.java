package com.fmi.application.cities;

import com.fmi.application.hotels.hotels;

public class Cities extends hotels {

    private String nameCity;
        private String street;
        private String number;

    public Cities(String name, String nameAdministrator, String numberPhone, int stars, int levels, int numberOfrooms, String country, String nameCity, String street, String number) {
        super(name, nameAdministrator, numberPhone, stars, levels, numberOfrooms, country);
        this.nameCity = nameCity;
        this.street = street;
        this.number = number;
    }

    public Cities(String nameCity, String street, String number) {
        this.nameCity = nameCity;
        this.street = street;
        this.number = number;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Cities() { }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }


}


