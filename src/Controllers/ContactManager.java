package Controllers;

import models.*;

public class ContactManager {
    private LinkedList<Contact<?,?>>contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?,?> contact) {
        contacts.appenedToTail(contact);
    }

    public void printList(List<Contact> contacts) {
        for(Contact contact : contacts){
            System.out.println(contact);
        }
    }
}
