package com.aleksiienkov.phonebookstorage;

import com.aleksiienkov.contact.Contact;

import java.util.Arrays;

public class ContactStorage {
    private Contact[] contacts = new Contact[0];

    public Contact[] getAll() {
        return contacts;
    }





    public void add(Contact contact) {
        contacts = Arrays.copyOf(contacts, contacts.length + 1);
        contacts[contacts.length - 1] = contact;
    }

    public void delete(String phone) {
        Contact[] tmp = new Contact[contacts.length - 1];
        boolean toDelete = false;
        for (int i = 0; i < tmp.length; i++) {
            if (phone.equals(contacts[i].getPhone())) toDelete = true;
            if (toDelete) tmp[i] = contacts[i + 1];
            else tmp[i] = contacts[i];
        }
        contacts = tmp;
    }

}










