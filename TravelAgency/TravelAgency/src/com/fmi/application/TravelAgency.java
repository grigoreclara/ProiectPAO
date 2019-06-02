/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmi.application;

import com.fmi.application.cities.Cities;
import com.fmi.application.client.CustomerDetails;
import com.fmi.application.deals.deals;
import com.fmi.application.employee.EmployeeDetails;
import com.fmi.application.hotels.hotels;
import com.fmi.application.period.period;
import com.fmi.application.services.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class TravelAgency {

    private static List<EmployeeDetails> angajati = new ArrayList<>();
    private static List<CustomerDetails> clienti = new ArrayList<>();
    private static List<deals> oferte = new ArrayList<>();
    private static List<hotels> hoteluri = new ArrayList<>();
    private static List<Cities> orase = new ArrayList<>();
    private static List<period> perioade = new ArrayList<>();
    private static void afiseazaMeniu() {
        System.out.println();

        System.out.println("Meniu:");
        System.out.println("0. Exit");
        System.out.println("1. Afiseaza Clientii.");
        System.out.println("2. Afiseaza Angajatii.");
        System.out.println("3. Afiseaza Hoteluri.");
        System.out.println("4. Afiseaza Oferte.");
        System.out.println("5. Afiseaza Hoteluri de N stele.");
        System.out.println("6. Afiseaza salariatii cu salariu mai mare de N lei.");
        System.out.println("7. Afiseaza oferte mai ieftine de N lei.");
        System.out.println("8. Afiseaza orase disponibile.");
        System.out.println("9. Adauga Orasul pe care ai vrea sa il vizitezi.");
        System.out.println("10. Adauga Client.");

        System.out.println("Alege Optiune: ");

    }

    private static void adaugaClient() {
        try {
            ReadService readService = new ReadService("src/files/clienti.csv");
            //readService.readLine(); // citim prima linie cu numele coloanelor

            String[] line = readService.readLine();
            while (line != null) {
                String location = line[0].trim();
                String cnp = line[1].trim();
                String dateOfBirth = line[2].trim();
                String emailAddress = line[3].trim();
                String phoneNumber = line[4].trim();
                String nameclient = line[5].trim();
                String pren = line[6].trim();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date datanastere = new Date();
                try {

                    datanastere = (Date) formatter.parse(dateOfBirth);


                } catch (ParseException e) {
                    e.printStackTrace();
                }

                CustomerDetails client = new CustomerDetails(location, cnp, datanastere, emailAddress, phoneNumber, nameclient, pren);

                clienti.add(client);

                line = readService.readLine();
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier");
        }
    }


    private static void adaugaAngajat() {
        try {
            ReadService readService = new ReadService("src/files/angajati..csv");
            //2readService.readLine(); // citim prima linie cu numele coloanelor

            String[] line = readService.readLine();
            while (line != null) {
                String Salary = line[0].trim();

                String function = line[1].trim();

                String cnp = line[2].trim();
                String department = line[3].trim();
                String DateOfBirth = line[4].trim();
                String name = line[5].trim();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date databirth = new Date();
                try {

                    databirth = formatter.parse(DateOfBirth);


                } catch (ParseException e) {
                    e.printStackTrace();
                }

                int salary = Integer.parseInt(Salary);

                EmployeeDetails angajat = new EmployeeDetails(salary, function, cnp, department, databirth, name);

                angajati.add(angajat);


                line = readService.readLine();
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea din fisier");
        }
    }


    private static void adaugaOferta() {
        try {
            ReadService readService = new ReadService("src/files/oferte.csv");
            //readService.readLine(); // citim prima linie cu numele coloanelor

            String[] line = readService.readLine();
            while (line != null) {
                String boardtype = line[0].trim();
                String price = line[1].trim();
                String numberOfdays = line[2].trim();



                int pret = Integer.parseInt(price);
                int nrzile= Integer.parseInt(numberOfdays);
               /* int stele= Integer.parseInt(stars);
                int etaje= Integer.parseInt(levels);
                int nrcamere=Integer.parseInt(numberOfrooms);*/
                deals oferta = new deals(boardtype, pret, nrzile);
                oferte.add(oferta);

                line = readService.readLine();
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier");
        }

    }


    private static void adaugaHotel() {
        try {
            ReadService readService = new ReadService("src/files/hoteluri.csv");
            //readService.readLine(); // citim prima linie cu numele coloanelor

            String[] line = readService.readLine();
            while (line != null) {
                String name=line[0].trim();
                String nameAdministrator=line[1].trim();
                 String  numberPhone=line[2].trim();
                String stars =line[3].trim();
                String  levels=line[4].trim();
                String numberOfrooms=line[5].trim();
                String country=line[6].trim();



                int nrcamere = Integer.parseInt(numberOfrooms);
                int etaje =  Integer.parseInt(levels);
                int stele = Integer.parseInt(stars);



                /*Integer nrcamere = Integer.valueOf(numberOfrooms);
                Integer stele = Integer.valueOf(stars);
                Integer etaje = Integer.valueOf(levels);*/
                hotels hotel = new hotels(name,  nameAdministrator,numberPhone , stele,etaje, nrcamere,country);



                hoteluri.add(hotel);

                line = readService.readLine();
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier");
        }

    }

    private static void adaugaOras() {
        try {
            ReadService readService = new ReadService("src/files/orase.csv");
            //readService.readLine(); // citim prima linie cu numele coloanelor

            String[] line = readService.readLine();
            while (line != null) {
                String nameClient=line[0].trim();
                String street=line[1].trim();
                String  number=line[2].trim();









                Cities oras = new Cities(nameClient,  street,number);



                orase.add(oras);

                line = readService.readLine();
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier");
        }

    }

    public static void main (String[]args) {
        adaugaAngajat();
        adaugaClient();
        adaugaHotel();
        adaugaClient();
        adaugaOferta();
        adaugaOras();
        ClientService clientService = new ClientService(clienti);
        //clientService.display();
        EmployeeService employeeService = new EmployeeService(angajati);
        DealsService dealsService = new DealsService(oferte);
        HotelsService hotelsService = new HotelsService(hoteluri);
        CityService citiesService = new CityService(orase);


        AuditService auditService = AuditService.getInstance();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int optiune = 0;
        afiseazaMeniu();

        try {
            optiune = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Eroare la citire/deschidere de fisier!");
        }
        while (optiune != 0) {
            // ClientService clientService = new ClientService(clienti);
            // EmployeeService employeeService = new EmployeeService(angajati);

            switch (optiune) {
                case 1: {
                    clientService.display();
                    auditService.writeLogLine("Afiseaza Client");
                    break;
                }
                case 2: {
                    employeeService.display();
                    auditService.writeLogLine("Afiseaza Angajat");
                    break;
                }
                case 3: {
                    hotelsService.display();
                    auditService.writeLogLine("Afiseaza Hotel");
                    break;
                }

                case 4: {
                    dealsService.display();

                    auditService.writeLogLine("Afiseaza Oferta");
                    break;
                }


                case 5: {

                    //citire n
                    int i;
                    System.out.println("Numarul de stele dorit:");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    for (i = 0; i < hoteluri.size(); i++)
                        if (hoteluri.get(i).getStars() == n)
                            hotelsService.display();
                    auditService.writeLogLine("Afiseaza Hotel cu stele");
                    break;
                }

                case 6: {
                    int i;
                    System.out.println("Tastati salariul:");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    for (i = 0; i < angajati.size(); i++)
                        if (angajati.get(i).getSalary() >= n)
                            employeeService.display();
                    auditService.writeLogLine("Afiseaza salariu ");

                    break;
                }

                case 7: {
                    int i;
                    System.out.println("Tastati pretul in lei ");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    for (i = 0; i < oferte.size(); i++)
                        if (oferte.get(i).getPrice() <= n)
                            dealsService.display();
                    auditService.writeLogLine("Afiseaza oferte ieftine ");
                    break;
                }
                case 8: {
                    citiesService.display();

                    auditService.writeLogLine("Afiseaza Oras");

                    break;
                }
                case 9: {
                    System.out.print("Introduceti numele orasului: ");
                    Scanner scan = new Scanner(System.in);
                    String oras = scan.nextLine();
                    System.out.print("Introduceti strada: ");
                    String strada = scan.nextLine();
                    System.out.print("Introduceti numarul strazii: ");
                    String numar = scan.nextLine();
                    Cities orasnou = new Cities(oras, strada, numar);
                    orase.add(orasnou);
                    citiesService.display();
                    auditService.writeLogLine("Afiseaza Oras nou");
                    break;
                }
                case 10: {
                    System.out.print("Introduceti numele clientului: ");
                    Scanner scan = new Scanner(System.in);
                    String nume = scan.nextLine();
                    System.out.print("Introduceti prenumele clientului: ");
                    String prenume = scan.nextLine();
                    System.out.print("Introduceti CNP: ");
                    String cnp = scan.nextLine();
                    System.out.print("Introduceti data nasterii: ");
                    String data = scan.nextLine();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    Date datanastere = new Date();
                    try {

                        datanastere = formatter.parse(data);


                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    System.out.print("Introduceti locatie: ");
                    String locatie = scan.nextLine();
                    System.out.print("Introduceti adresa de email: ");
                    String adresaemail = scan.nextLine();
                    System.out.print("Introduceti numar de telefon: ");
                    String nrtelefon = scan.nextLine();

                    CustomerDetails clientnou = new CustomerDetails(locatie, cnp, datanastere, adresaemail, nrtelefon, nume, prenume);
                    clienti.add(clientnou);
                    clientService.display();


                    break;
                }

                default: {
                    System.out.println("Ati ales o optiune care nu se regaseste in meniu");

                    break;
                }
            }

            try {
                System.out.println();
                System.out.println("Apasati enter pentru a continua");
                bufferedReader.readLine();
            } catch (IOException e) {
                System.err.println("Eroare la citire/deschidere de fisier!");
            }

            afiseazaMeniu();

            try {
                optiune = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                System.err.println("Eroare la citire/deschidere de fisier!");
            }


        }

    /*System.out.println("Logare:");
        Scanner sc = new Scanner(System.in);
        String nume = sc.nextLine();

        String prenume = sc.nextLine();
         String username= sc.nextLine();
         String parola =sc.nextLine();
         String data=sc.nextLine();
        DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");
        Date date = formatter.parse(data);
        //System.out.println(date);
       // sale.setDate(sc.next());

        User usernou =new User(nume,prenume,date,username,parola);
         System.out.println(usernou.getUserName());
         System.out.println(usernou.getLastName());
*/






    }




    }





