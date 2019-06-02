package com.fmi.application.services;

import com.fmi.application.deals.deals;

import java.util.List;

public class DealsService implements Service {

    private List<deals> oferte;

    public DealsService(List<deals> oferte) {
        this.oferte= oferte;

    }

    @Override
    public void display() {
        for (deals oferta : oferte) {
            System.out.println("Tipul mesei:");
            System.out.println(oferta.getBoardTypes());
            System.out.println("Numarul de zile al sejurului:");
            System.out.println(oferta.getNumberOfdays());
            System.out.println("Pretul total al ofertei");
            System.out.println(oferta.getPrice());
            //System.out.println(oferta.getCountryOffer());

        }

    }

    @Override
    public void add(Object o) {
        oferte.add((deals) o);

    }

    @Override
    public void remove(Object o) {oferte.remove(o);

    }

    @Override
    public void remove(int i) {
        oferte.remove(i);
    }
}
