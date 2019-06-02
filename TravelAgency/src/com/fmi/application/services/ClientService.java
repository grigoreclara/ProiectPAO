package com.fmi.application.services;

import com.fmi.application.client.CustomerDetails;


import java.util.List;

public class ClientService implements Service {
    private List<CustomerDetails> clienti;

    public ClientService(List<CustomerDetails> clienti) {
        this.clienti = clienti;
    }


    @Override
    public void display() {
        for (CustomerDetails  client : clienti) {
            System.out.println(client.getPren());
            System.out.println(client.getName());
            System.out.println(client.getCnp());
            System.out.println(client.getDateOfBirth());
            System.out.println(client.getLocation());
            System.out.println(client.getemailAddress());
            System.out.println(client.getPhoneNumber());

        }
    }

    @Override
    public void add(Object o) {
        //CustomerDetails client = (CustomerDetails) o;
        clienti.add((CustomerDetails) o);


    }

    @Override
    public void remove(Object o) {
        clienti.remove(o);
    }

    @Override
    public void remove(int i) {
        clienti.remove(i);
    }

}

