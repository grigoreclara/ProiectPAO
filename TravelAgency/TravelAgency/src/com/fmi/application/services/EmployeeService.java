package com.fmi.application.services;

import com.fmi.application.employee.EmployeeDetails;

import java.util.List;

public class EmployeeService implements Service {
    private List<EmployeeDetails> angajati;

    public EmployeeService(List<EmployeeDetails> angajati) {
        this.angajati = angajati;
    }
    @Override
    public void display() {
        for (EmployeeDetails angajat : angajati) {
            System.out.println(angajat.getName());
            System.out.println(angajat.getCnp());
            System.out.println(angajat.getfunction());
            System.out.println(angajat.getdepartment());
            System.out.println(angajat.getDateOfBirth());
            System.out.println(angajat.getSalary());
        }

    }

    @Override
    public void add(Object o) {
        angajati.add((EmployeeDetails) o);

    }

    @Override
    public void remove(Object o) {angajati.remove(o);

    }

    @Override
    public void remove(int i) {
            angajati.remove(i);
        }


}
