package view;
import java.util.Scanner;

import ug.exercise.infrastructure.controllers.ControllerPerson;

public class InterfaceConsole {
    private final Scanner scanner;
    private final ControllerPerson controller;

    public InterfaceConsole() {
        this.scanner = new Scanner(System.in);
        this.controller = new ControllerPerson();
    }

    public void inizializateMenu(){
        int option;
        do { 
            menu();
            option=cleanBuffer();
            process(option);
        } while (option!=0);
    }

    public int cleanBuffer(){
        try {
            return scanner.nextInt();
        } catch (Exception ex) {
            scanner.nextLine();
            return -1;
        }
    }

    public void menu(){
        System.out.println("\n"+"-".repeat(5)+"WELCOME TO KEEPDATAPERSON!"+"-".repeat(5));
        System.out.println("What do you want Sir/Miss?\n"+
        "1. LIST\n"+
        "2. REGISTER\n"+
        "3. EDIT (FOR NOW IT'S ON BETA - IT DOESN'T WORK)\n"+
        "4. SEARCH BY ID\n"+
        "5. DELETE\n"+
        "0. EXIT\n");

        System.out.print("Type your option: ");
    }

    public void process(int option){
        switch (option) {
            case 1 -> controller.getAll();
            case 2 -> controller.create();
            case 3 -> System.out.println("\nSORRY, WE STILL WORKING ON IT...");
            case 4 -> controller.getById();
            case 5 -> controller.delete();
            case 0 -> System.out.println("LEAVING THE MENU...");
            default -> System.out.println("ERROR: YOU MUST INPUT A NUMBER!");
        }
    }
}
