package com.aleksiienkov;


import com.aleksiienkov.phonebookstorage.ContactStorage;
import com.aleksiienkov.phonebookstorage.ContactsControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    ContactStorage phoneBook=new ContactStorage();
    ContactsControl contactsControl=new ContactsControl(sc,phoneBook);
    while (true){
        contactsControl.addNewContact();
        System.out.println("If you want to continue press 1");
        int choice=sc.nextInt();
        sc.nextLine();
        if (choice!=1) break;
    }

contactsControl.showContactStorage();
    contactsControl.searchContactForPhone();
    contactsControl.searchContactForName();
    contactsControl.deleteContact();
    contactsControl.showContactStorage();


        }

}
