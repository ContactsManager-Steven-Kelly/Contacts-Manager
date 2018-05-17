import util.Input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsMain {
    public static Input userInput = new Input();
    public static ArrayList<Contact> contacts = new ArrayList<>();
    public static ArrayList<String> readArray = new ArrayList<>();
    public static String directory = "data";
    public static String filename = "contacts.txt";

    public static void main(String[] args) {


        createFileIfNotExists(directory, filename);
//        try
//
//    {
//        contacts = readLines(directory, filename);
//    } catch(
//    Exception e)
//
//    {
//        System.out.println(e);
//    }

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
                viewAllContacts();
                showMenu();
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
                try {
                    writeListToFile(contacts, directory, filename);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.exit(0);
                break;
            default:
                System.out.println("Not a valid choice");
                showMenu();
        }
    }

    public static void viewAllContacts() {

        try {
            System.out.println("Name            |  Phone Number  |");
            readLines(directory, filename);
            for (Contact contact : contacts) {
                System.out.println(contact.getNames() + " " + contact.getNumber());
            }
        } catch (Exception e) {
            System.out.println(e);
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

    public static void again() {
        System.out.println("Would you like to add another? ");
        System.out.print("(yes or no): ");
        boolean answer = userInput.yesNo();
        if (answer) {
            addNewContact();
            again();
        } else {
            showMenu();
        }
    }

    public static void createFileIfNotExists(String directory, String filename) {

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (Files.notExists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeListToFile(ArrayList<Contact> contacts, String directory, String filename) throws IOException {
        ArrayList<String> out = new ArrayList<>();
        for (Contact contact : contacts) {
            out.add(contact.getNames() + " " + contact.getNumber());
        }
        Path filepath = Paths.get(directory, filename);
        Files.write(filepath, out, StandardOpenOption.APPEND);

    }

    public static void readLines(String directory, String filename) throws IOException {

        Path filePath = Paths.get(directory, filename);

        List<String> list = Files.readAllLines(filePath);

        for (String item : list) {
            readArray.add(item);
            System.out.println(item);
        }
    }

}
