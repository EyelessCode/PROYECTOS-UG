package ug.exercise.infrastructure.controllers;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ug.exercise.app.services.ServicePerson;
import ug.exercise.domain.model.Person;
import ug.exercise.infrastructure.repository.RepositoryPerson;

public class ControllerPerson {
    private final Scanner scanner;
    private final ServicePerson services;
    private final RepositoryPerson repo;

    public ControllerPerson() {
        this.repo = new RepositoryPerson();
        this.scanner = new Scanner(System.in);
        this.services = new ServicePerson(repo);
    }

    public void create(){
        scanner.nextLine();
        System.out.println("\n"+"-".repeat(5)+"PERSON REGISTER"+"-".repeat(5));

        try {
            System.out.print("Full name: ");
            String name=scanner.nextLine();

            System.out.print("Sex (M/F): ");
            char sex=scanner.nextLine().toUpperCase().charAt(0);

            System.out.print("Age: ");
            int age=scanner.nextInt();

            int id=services.registerRun(name, age, sex);
            System.out.println("PERSON REGISTERED: "+id);

        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }

    public void getAll(){
        System.out.println("\n"+"-".repeat(5)+"PERSON LIST"+"-".repeat(5));
        List<Person> personList=services.getAllRun();

        if (personList.isEmpty()) {
            System.out.println("There aren't person here!");
        } else {
            System.out.printf("%-4s | %-20s | %-4s | %-4s%n","ID","NAME"
            ,"AGE","SEX");
            System.out.println("-".repeat(20));
            personList.forEach(System.out::println);
        }
    }

    public void getById(){
        System.out.print("Type person's ID: ");
        try {
            int id=scanner.nextInt();
            scanner.nextLine();
            Person personId=services.searchByIdRun(id);

            if (personId!=null) {
                System.out.println("\nPERSON FOUND: ");
                System.out.println(personId);
            } else {
                System.out.println("COULDN'T FOUND PERSON: "+id+"!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("ERROR: INPUT A VALID NUMBER!");
            scanner.nextLine();
        }
    }

    public void delete(){
        System.out.print("\nTYPE PERSON'S ID TO DELETE: ");
        try {
            int id=scanner.nextInt();
            scanner.nextLine();

            boolean delete=services.deleteRun(id);

            if (delete) {
                System.out.println("PERSON'S "+id+"DELETED SUCESSFULLY!");
            }else{
                System.out.println("COULDN'T FOUND PERSON: "+id+"!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("ERROR: INPUT A VALID NUMBER!");
            scanner.nextLine();
        }
    }

    public void showPersons(){
        System.out.println("\n"+"-".repeat(5)+"PERSON"+"-".repeat(5));
        System.out.println("PERSON REGISTERED: "+repo.sizeList());
    }
}
