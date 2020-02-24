package main;

import LinkedListLL.LinkedListLL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListLL linkedListLL = new LinkedListLL();
        Functions func = new Functions();
        System.out.println("Welcome to Mansi's Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program ");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice ==1){
            func.addContact(linkedListLL);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice ==2){
            func.viewContact(linkedListLL);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice ==3){
            func.searchContact(linkedListLL);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice ==4){
            func.deleteContact(linkedListLL);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice ==5){
            System.out.println("App exit.");
        }

    }
}
