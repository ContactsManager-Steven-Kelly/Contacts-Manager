import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsMain {
    public static Input userInput = new Input();
    public static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. View Contact.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit");
        System.out.print("Enter an option(1, 2, 3, 4, 5):");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
        for (Contact contact : contacts)
            System.out.println(contact.getNames() + " " + contact.getNumber());
                break;
            case 2:
                addNewContact();
                again();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Thank you for using Contact Manager 1.0");
                System.exit(0);
                break;
            default:
                System.out.println("Not a valid choice");
                showMenu();
        }
    }

    public static Contact addNewContact() {

        System.out.print("Please enter contacts name: ");
        String name = userInput.getString();
        System.out.println();
        System.out.print("Please enter contact number: ");
        String number = userInput.getString();
        Contact newContact = new Contact(name, number);
        contacts.add(newContact);
        return newContact;
    }

    public static void again(){
        System.out.println("Would you like to add another? ");
        System.out.print("(yes or no): ");
        boolean answer = userInput.yesNo();
        if (answer){
            addNewContact();
            again();
        }else {
            showMenu();
        }
    }


}
