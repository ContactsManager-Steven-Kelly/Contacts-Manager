import util.Input;

import java.util.Scanner;

public class ContactsMain {
    public static Input userInput = new Input();
    public static void main(String[] args) {
        showMenu();
        }
        public static void showMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. View Contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit");
        System.out.print("Enter an option(1, 2, 3, 4, 5):");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2:
                addNewContact();
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
    public static void addNewContact(){

        System.out.print("Please enter contacts name: ");
        String name = userInput.getString();
        System.out.println();
        System.out.print("Please enter contact number: ");
        String number = userInput.getString();
        Contacts newContact = new Contacts(name, number);
        System.out.println("Would you like to enter another name?");
        boolean confirm = userInput.yesNo();
        if(confirm){
            addNewContact();
        }else {
            showMenu();
        }
    }


}
