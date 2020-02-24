package main;

import LinkedListLL.LinkedListLL;
import person.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class Functions {
    Scanner sc = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(LinkedListLL linkedListLL){
        System.out.println("You have chosen to add a new contact: \n" + "Please enter the name of the Person");
        System.out.println("First Name: ");
        String fName = sc.nextLine().trim();
        while(true){
            if(fName.matches("[A-Za-z]+")){
                break;
            }
            else{
                System.out.println("please enter correct name.");
            }
            fName = sc.nextLine().trim();
        }
        System.out.println("Last Name: ");
        String lName = sc.nextLine().trim();
        while(true){
            if(lName.matches("[A-Za-z]+")){
                break;
            }
            else{
                System.out.println("Please enter correct name.");
            }
            lName = sc.nextLine().trim();
        }
        System.out.println("Contact Number: ");
        while(true){
            String contact = sc.nextLine().trim();
            if(contact.matches("[0-9]{10}")){
                linkedList.add(contact);
                break;
            }
        }
        while(true){
            System.out.println("Would you like to add another contact number? (y/n): ");
            char choice = sc.next().charAt(0);
            if(choice=='y') {
                System.out.println("Contact Number: ");
                String contactNo = sc.nextLine().trim();
                while (true) {
                    if (contactNo.matches("[0-9]{10}")) {
                        linkedList.add(contactNo);
                        break;
                    } else {
                        System.out.println("Add correct Number.");
                    }
                }
            }
                else{
                        break;
                    }
            }
            System.out.println("Enter your email address: ");
            sc.nextLine();
            while(true){
                String temp = sc.nextLine();
                if(temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")){
                    linkedListLL.addLast(new Person(fName,lName,linkedList,temp));
                    break;
                }
                else{
                    System.out.println("invalid email adress! try again");
                }
            }
        }

        public void viewContact(LinkedListLL linkedListLL){
            System.out.println("---Here are all your contacts---");
            if(!linkedListLL.isEmpty()){
                linkedListLL.display();
            }
            else{
                System.out.println("No results found");
            }
        }
        public void deleteContact(LinkedListLL linkedListLL){
            if(!linkedListLL.isEmpty()){
                System.out.println("Here are all the contacts: Press the number against\" +\n" +
                        "                    \" to delete the contact.");
                linkedListLL.displayOne();
                int choice = sc.nextInt();
                sc.nextLine();
                linkedListLL.deleteNode(choice);
                linkedListLL.displayOne();
                System.out.println("Deleted..!!");
            }else{
                System.out.println("No Contacts.You must need to add contacts Before you could delete..");
            }
        }

        public void searchContact(LinkedListLL linkedListLL){
            System.out.println("You could search for a contact from their first names: ");
            String firstName = sc.nextLine().trim();
            if(linkedListLL.indexOf(firstName)>=0){
                System.out.println("Match found");
                linkedListLL.getNode(linkedListLL.indexOf(firstName));
            }
            else{
                System.out.println("No match found");
            }
        }
    }

