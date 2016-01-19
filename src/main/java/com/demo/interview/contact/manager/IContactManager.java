package com.demo.interview.contact.manager;

import com.demo.interview.contact.Contact;

import java.util.List;

/**
 * Created by kent on 1/11/16.
 */
public interface IContactManager {
    void addContact(Contact contact);
    List<Contact> getContacts();
}
