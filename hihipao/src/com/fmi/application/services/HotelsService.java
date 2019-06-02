package com.fmi.application.services;

import com.fmi.application.hotels.hotels;

import java.util.List;

public class HotelsService implements Service {
    private List<hotels> hoteluri;

    public HotelsService(List<hotels> hoteluri) {
        this.hoteluri= hoteluri;

    }
    @Override
    public void display() {
        for (hotels hotel : hoteluri) {
            System.out.println(hotel.getName());
            System.out.println(hotel.getStars());
            System.out.println(hotel.getCountry());
            System.out.println(hotel.getNameAdministrator());
            System.out.println(hotel.getNumberPhone());
            System.out.println(hotel.getLevels());
            System.out.println(hotel.getNumberOfrooms());



        }

    }

    @Override
    public void add(Object o) {
        hoteluri.add((hotels) o);

    }

    @Override
    public void remove(Object o) {hoteluri.remove(o);

    }

    @Override
    public void remove(int i) {
        hoteluri.remove(i);
    }
}



