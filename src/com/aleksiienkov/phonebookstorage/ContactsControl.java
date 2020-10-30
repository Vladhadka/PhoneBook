package com.aleksiienkov.phonebookstorage;

import com.aleksiienkov.contact.Contact;

import java.util.Scanner;


public class ContactsControl {
    private Scanner sc;
    private ContactStorage contactStorage;

    public ContactsControl(Scanner sc, ContactStorage contactStorage) {
        this.sc = sc;
        this.contactStorage = contactStorage;
    }

    public void showContactStorage() {
        System.out.println("            PHONE BOOK          ");
        for (Contact contact : contactStorage.getAll()) {
            System.out.printf("| %-15s %-15s | \n",
                    contact.getName(),
                    contact.getPhone());
        }
        System.out.println("________________________________");
    }

    public void addNewContact() {
        System.out.println("Enter the new Contact name");
        String nm = sc.nextLine();
        System.out.println("Enter the new Contact phone");
        String ph = sc.nextLine();
        Contact s = new Contact(nm, ph);
        contactStorage.add(s);
    }

    public void deleteContact() {
        System.out.println("What contact phone do you gonna to delete?");
        String ph = sc.nextLine();
        contactStorage.delete(ph);

    }

    public void searchContactForPhone() {
        System.out.println("Enter the phone:");
        String phone = sc.nextLine();
        System.out.println("________________________________");
        for (Contact subscriber : contactStorage.getAll()) {
            if (phone.equals(subscriber.getPhone()))
                System.out.printf("| %-10s %-15s | \n",
                        subscriber.getName(),
                        subscriber.getPhone());
        }
        System.out.println("_____________________________________");
    }


    public void searchContactForName() {
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("_________________________________");
        for (Contact contact : contactStorage.getAll()) {
            if (name.equals(contact.getName()))
                System.out.printf("| %-10s %-15s | \n",
                        contact.getName(),
                        contact.getPhone());
        }
        System.out.println("_____________________________________");
    }
}




