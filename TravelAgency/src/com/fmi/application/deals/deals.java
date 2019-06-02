package com.fmi.application.deals;


import com.fmi.application.hotels.hotels;

public class deals extends hotels {
    private String boardTypes;
    private int price;
    private int numberOfdays;


    public deals(String name, String nameAdministrator, String numberPhone, int stars, int levels, int numberOfrooms, String country, String boardTypes, int price, int numberOfdays) {
        super(name, nameAdministrator, numberPhone, stars, levels, numberOfrooms, country);
        this.boardTypes = boardTypes;
        this.price = price;
        this.numberOfdays = numberOfdays;
    }

    public deals(String boardTypes, int price, int numberOfdays) {
        this.boardTypes = boardTypes;
        this.price = price;
        this.numberOfdays = numberOfdays;
    }

    public deals(){}

    public String getBoardTypes() {
        return boardTypes;
    }

    public void setBoardTypes(String boardTypes) {
        this.boardTypes = boardTypes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfdays() {
        return numberOfdays;
    }

    public void setNumberOfdays(int numberOfdays) {
        this.numberOfdays = numberOfdays;
    }


}
