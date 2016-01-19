package com.demo.interview;

import com.demo.interview.contact.Contact;
import com.demo.interview.contact.manager.ContactManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * This tests the contact manager functionality.
 */
public class ContactManagerTest {
    @Test
    public void WhenAddingContactThenContactQuantityIncreased() {
        // Setup
        int endingContactListSize = 2;
        List<Contact> contactList = new ArrayList<>();
        Contact alexContact = new Contact("Alex","Lerikos","https://github.com/alexlerikos");
        contactList.add(alexContact);
        ContactManager contactManager = new ContactManager(contactList);
        Contact kentContact = new Contact("Kent", "Johnson", "https://github.com/kentoj");

        // Execution
        contactManager.addContact(kentContact);

        // Assertion
        assertNotNull(contactList);
        assertEquals(endingContactListSize, contactManager.getContacts().size());
    }

    @Test
    public void WhenRemovingContactThenContactQuantityDecreased() {

    }


}
