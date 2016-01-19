package com.demo.interview.contact.manager;

import com.demo.interview.contact.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kent on 1/11/16.
 */
public class ContactManager implements IContactManager {

    private List<Contact> managedContacts;

    public ContactManager(List<Contact> contactsToManage) {
        this.managedContacts = contactsToManage;
    }

    @Override
    public void addContact(Contact contact) {
        managedContacts.add(contact);
    }

    @Override
    public List<Contact> getContacts() {
        List<Contact> contactListCopy = new ArrayList<>();
        contactListCopy.addAll(managedContacts);
        return contactListCopy;
    }


}
