package com.fmi.application.services;

import com.fmi.application.cities.Cities;

import java.util.List;

public class CityService implements Service {

    private List<Cities> orase;

    public CityService(List<Cities> orase ) {
        this.orase= orase;

    }

    @Override
    public void display() {
        for (Cities oras : orase) {
            System.out.println("Numele orasului:");
            System.out.println(oras.getNameCity());
            System.out.println("Strada:");
            System.out.println(oras.getStreet());
            System.out.println("Numar:");
            System.out.println(oras.getNumber());


        }

    }

    @Override
    public void add(Object o) {
        orase.add((Cities) o);

    }

    @Override
    public void remove(Object o) {orase.remove(o);

    }

    @Override
    public void remove(int i) {
        orase.remove(i);
    }
}
