import java.util.*;

public class ContactManagerApp_FEU_2024 {
    // Dhruv Thakar

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ContactManager contactManager = new ContactManager();

            // Introduction
            System.out.println("Contact Manager App\n");

            // Program overview
            System.out.println(
                    "This Java program allows users to manage a contact list. It provides a menu-driven interface");
            System.out.println(
                    "that allows users to perform various operations such as adding contacts, searching for contacts");
            System.out.println("by name or phone number, updating contact information, and displaying all contacts.\n");

            System.out.println("The program consists of three main classes:");
            System.out.println(
                    "1. ContactManagerApp_FEU: The main class that contains the main method and handles user input and interaction.");
            System.out.println(
                    "2. Contact: Represents a contact with a name, phone number, email address, and addresses.");
            System.out.println(
                    "3. ContactManager: Manages the contact list and provides operations to add, search, update, and display contacts.\n");

            System.out.println(
                    "The ContactManagerApp_FEU class contains a loop that repeatedly displays a menu of options to the user and");
            System.out.println(
                    "performs the corresponding actions based on the user's choice. The user can add contacts, search for contacts");
            System.out.println(
                    "by name or phone number, update contact information, display all contacts, or exit the program.\n");
            System.out.println(
                    "The ContactManager class provides methods to manage the contact list. It stores contacts in an array and");
            System.out.println(
                    "provides operations to add contacts, search for contacts by name or phone number, update contact information,");
            System.out.println("and display all contacts.\n");

            System.out.println(
                    "The Contact class represents a contact with a name, phone number, email address, and addresses. It provides getter and");
            System.out.println("setter methods to access and modify the contact's information.\n");
            System.out.println(
                    "This program demonstrates basic object-oriented programming concepts, such as classes, objects, encapsulation,");
            System.out.println(
                    "and method invocation. It also utilizes arrays, loops, conditional statements, and user input handling.\n");
            System.out.println(
                    "This program also uses bubble and binary algorithms and recursion to search and sort contacts.\n");

            while (true) {
                // Menu options
                System.out.println("Contact Manager");
                System.out.println("1. Add a contact");
                System.out.println("2. Search for a contact by name");
                System.out.println("3. Search for a contact by phone number");
                System.out.println("4. Update a contact");
                System.out.println("5. Display all contacts");
                System.out.println("6. Exit");
                System.out.print("Enter the number of your choice: ");
                int choice = scanner.nextInt();

                scanner.nextLine(); // Consume new line character

                switch (choice) {
                    case 1:
                        // Add a contact
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Enter email address: ");
                        String emailAddress = scanner.nextLine();
                        System.out.print("Enter number of addresses: ");
                        int numAddresses = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        String[] addresses = new String[numAddresses];
                        for (int i = 0; i < numAddresses; i++) {
                            System.out.print("Enter address " + (i + 1) + ": ");
                            addresses[i] = scanner.nextLine();
                        }
                        Contact contact = new Contact(name, phoneNumber, emailAddress, addresses);
                        contactManager.addContact(contact);
                        break;
                    case 2:
                        // Search for a contact by name
                        System.out.print("Enter name to search: ");
                        String searchName = scanner.nextLine();
                        Contact foundContactByName = contactManager.searchByName(searchName);
                        if (foundContactByName != null) {
                            System.out.println("Contact found:");
                            System.out.println("Name: " + foundContactByName.getName());
                            System.out.println("Phone Number: " + foundContactByName.getPhoneNumber());
                            System.out.println("Email Address: " + foundContactByName.getEmailAddress());
                            System.out.println("Addresses: " + Arrays.toString(foundContactByName.getAddresses()));
                        } else {
                            System.out.println("Contact not found.");
                        }
                        break;
                    case 3:
                        // Search for a contact by phone number
                        System.out.print("Enter phone number to search: ");
                        String searchPhoneNumber = scanner.nextLine();
                        Contact foundContactByPhoneNumber = contactManager.searchByPhoneNumber(searchPhoneNumber);
                        if (foundContactByPhoneNumber != null) {
                            System.out.println("Contact found:");
                            System.out.println("Name: " + foundContactByPhoneNumber.getName());
                            System.out.println("Phone Number: " + foundContactByPhoneNumber.getPhoneNumber());
                            System.out.println("Email Address: " + foundContactByPhoneNumber.getEmailAddress());
                            System.out.println("Addresses: " + Arrays.toString(foundContactByPhoneNumber.getAddresses()));
                        } else {
                            System.out.println("Contact not found.");
                        }
                        break;
                    case 4:
                        // Update a contact
                        System.out.print("Enter name of the contact to update: ");
                        String updateName = scanner.nextLine();
                        Contact updateContact = contactManager.searchByName(updateName);
                        if (updateContact != null) {
                            System.out.print("Enter new phone number: ");
                            String newPhoneNumber = scanner.nextLine();
                            System.out.print("Enter new email address: ");
                            String newEmailAddress = scanner.nextLine();
                            System.out.print("Enter number of new addresses: ");
                            int newNumAddresses = scanner.nextInt();
                            scanner.nextLine(); // Consume newline character
                            String[] newAddresses = new String[newNumAddresses];
                            for (int i = 0; i < newNumAddresses; i++) {
                                System.out.print("Enter new address " + (i + 1) + ": ");
                                newAddresses[i] = scanner.nextLine();
                            }
                            contactManager.updateContact(updateContact, newPhoneNumber, newEmailAddress, newAddresses);
                        } else {
                            System.out.println("Contact not found.");
                        }
                        break;
                    case 5:
                        // Display all contacts
                        contactManager.displayContacts();
                        break;
                    case 6:
                        // Exit the program
                        System.out.println("Exiting the Contact Manager App. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                }
            }
        }
    }
}

// Class to represent a contact
class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String[] addresses;

    // Constructor to initialize a contact
    public Contact(String name, String phoneNumber, String emailAddress, String[] addresses) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.addresses = addresses;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }
}

// Class to manage the contact list
class ContactManager {
    public static final int MAX_CONTACTS = 100;
    private Contact[] contacts;
    private int numContacts;

    public ContactManager() {
        contacts = new Contact[MAX_CONTACTS];
        numContacts = 0;
    }

    public void addContact(Contact contact) {
        if (numContacts < MAX_CONTACTS) {
            contacts[numContacts] = contact;
            numContacts++;
            bubbleSortByName(numContacts);
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Cannot add more contacts. Contact list is full.");
        }
    }

    // Recursive bubble sort based on contact name
    private void bubbleSortByName(int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (contacts[i].getName().compareToIgnoreCase(contacts[i + 1].getName()) > 0) {
                Contact temp = contacts[i];
                contacts[i] = contacts[i + 1];
                contacts[i + 1] = temp;
            }
        }
        bubbleSortByName(n - 1);
    }

    public Contact searchByName(String name) {
        // Could use binary search since it’s sorted
        return binarySearchByName(name);
    }

    public Contact binarySearchByName(String name) {
        int left = 0;
        int right = numContacts - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = contacts[mid].getName().compareToIgnoreCase(name);
            if (cmp == 0) return contacts[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    public Contact searchByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getPhoneNumber().equals(phoneNumber)) {
                return contacts[i];
            }
        }
        return null;
    }

    public void updateContact(Contact contact, String newPhoneNumber, String newEmailAddress, String[] newAddresses) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getName().equalsIgnoreCase(contact.getName())) {
                contacts[i].setPhoneNumber(newPhoneNumber);
                contacts[i].setEmailAddress(newEmailAddress);
                contacts[i].setAddresses(newAddresses);
                bubbleSortByName(numContacts);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void displayContacts() {
        if (numContacts == 0) {
            System.out.println("Contact list is empty.");
            return;
        }

        System.out.println("Contact List:");
        for (int i = 0; i < numContacts; i++) {
            Contact c = contacts[i];
            System.out.println("Name: " + c.getName());
            System.out.println("Phone Number: " + c.getPhoneNumber());
            System.out.println("Email Address: " + c.getEmailAddress());
            System.out.println("Addresses: " + Arrays.toString(c.getAddresses()));
            System.out.println("--------------------");
        }
    }
}
