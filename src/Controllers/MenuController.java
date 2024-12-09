package Controllers;

import Views.ConsoleView;
import models.Contact;
import models.LinkedList;
import Controllers.*;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;
    
    public void showMenu(){
        boolean exit= false;
        while(!exit){
            consoleView.displayMenu();
            String option= consoleView.getinput("");
            switch (option) {
                case "1":
                    addContact();
                    break;
            
                case "2":
                    
                    break;
            
                case "3":
                    
                    break;
            
                case "4":
                    printList();
                    break;

                case "5":
                    exit= true;
                    consoleView.showMessage("Exiting...");
                    break;
            
                default:
                    consoleView.showMessage("Invalid option");
                    break;
            }
        }

    }

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView =new ConsoleView();
    }

    private void addContact(){
        String name= consoleView.getinput("Enter name: ");
        String phone= consoleView.getinput("Enter phone: ");
        Contact<String, String> contact= new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contact created");
    }

    private void findContact(){
        
    }

    private void deletedContact(){
        
    }

    private void printList(){
        LinkedList<Contact<String, String>> contacts= contactManager.getContacts();
        consoleView.showMessage("Contacts:");
        for(Contact<String, String> contact: contacts){
            consoleView.showMessage(contact.toString());
        }
    }
}
