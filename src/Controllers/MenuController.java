package Controllers;

import Views.ConsoleView;
import models.Contact;

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
                    findContact();
                    break;
            
                case "3":
                    deletedContact();
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

    private void findContact() {
        String name = consoleView.getinput("Enter a name to search: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contact found: " + contact);
        } else {
            consoleView.showMessage("Contact not found 404");
        }
    }

    private void deletedContact(){
        System.out.println("SOON...");
        String name= consoleView.getinput("Enter a name to delete: ");
        contactManager.deletedContactByName(name);
        consoleView.showMessage("Contact deleted");

    }

    private void printList(){
       consoleView.showMessage("Lista");
       contactManager.printList();
       consoleView.showMessage("======"); 
    }
}
