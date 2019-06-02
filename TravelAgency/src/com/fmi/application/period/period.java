package com.fmi.application.period;

import com.fmi.application.deals.deals;

import java.util.Date;

public class period extends deals {
    private String season;
    private Date date;
    //private deals offer;


    public period(String name, String nameAdministrator, String numberPhone, int stars, int levels, int numberOfrooms, String country, String boardTypes, int price, int numberOfdays, String season, Date date) {
        super(name, nameAdministrator, numberPhone, stars, levels, numberOfrooms, country, boardTypes, price, numberOfdays);
        this.season = season;
        this.date = date;
    }

    public period(String boardTypes, int price, int numberOfdays, String season, Date date) {
        super(boardTypes, price, numberOfdays);
        this.season = season;
        this.date = date;
    }

    public period(String season, Date date) {
        this.season = season;
        this.date = date;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
