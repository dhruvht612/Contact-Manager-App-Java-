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
    // Maximum number of contacts that can be stored
    public static final int MAX_CONTACTS = 100;
    // Array to store contact information
    public String[][] contacts;
    // Number of contacts currently stored
    public int numContacts;

    // Constructor to initialize the contact manager
    public ContactManager() {
        contacts = new String[MAX_CONTACTS][];
        numContacts = 0;
    }

    // Method to add a contact to the contact list
    public void addContact(Contact contact) {
        if (numContacts < MAX_CONTACTS) {
            contacts[numContacts] = new String[4 + contact.getAddresses().length];
            contacts[numContacts][0] = contact.getName();
            contacts[numContacts][1] = contact.getPhoneNumber();
            contacts[numContacts][2] = contact.getEmailAddress();
            contacts[numContacts][3] = Integer.toString(contact.getAddresses().length);
            System.arraycopy(contact.getAddresses(), 0, contacts[numContacts], 4, contact.getAddresses().length);
            numContacts++;
            bubbleSortByName(numContacts);  // Use recursive bubble sort to sort the contacts array by name
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Cannot add more contacts. Contact list is full.");
        }
    }

    // Recursive method to sort contacts by name using bubble sort
    public void bubbleSortByName(int n) {
        // Base case: if there is only one element left, stop the recursion
        if (n == 1) return;

        // Perform one pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (contacts[i][0].compareToIgnoreCase(contacts[i + 1][0]) > 0) {
                // Swap contacts[i] and contacts[i + 1]
                String[] temp = contacts[i];
                contacts[i] = contacts[i + 1];
                contacts[i + 1] = temp;
            }
        }

        // Recursively call bubbleSortByName for the remaining elements
        bubbleSortByName(n - 1);
    }

    // Method to search for a contact by name using binary search
    public Contact binarySearchByName(String name) {
        int left = 0;
        int right = numContacts - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = contacts[mid][0].compareToIgnoreCase(name);

            if (comparison == 0) {
                // If the contact is found, return the contact object
                String[] addresses = Arrays.copyOfRange(contacts[mid], 4, 4 + Integer.parseInt(contacts[mid][3]));
                return new Contact(contacts[mid][0], contacts[mid][1], contacts[mid][2], addresses);
            } else if (comparison < 0) {
                // If the name is greater, ignore the left half
                left = mid + 1;
            } else {
                // If the name is smaller, ignore the right half
                right = mid - 1;
            }
        }
        // Return null if the contact is not found
        return null;
    }

    // Method to search for a contact by phone number
    public Contact searchByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i][1].equals(phoneNumber)) {
                // If the contact is found, return the contact object
                String[] addresses = Arrays.copyOfRange(contacts[i], 4, 4 + Integer.parseInt(contacts[i][3]));
                return new Contact(contacts[i][0], contacts[i][1], contacts[i][2], addresses);
            }
        }
        // Return null if the contact is not found
        return null;
    }

    // Method to search for a contact by name using linear search
    public Contact searchByName(String name) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i][0].equalsIgnoreCase(name)) {
                // If the contact is found, return the contact object
                String[] addresses = Arrays.copyOfRange(contacts[i], 4, 4 + Integer.parseInt(contacts[i][3]));
                return new Contact(contacts[i][0], contacts[i][1], contacts[i][2], addresses);
            }
        }
        // Return null if the contact is not found
        return null;
    }

    // Method to update contact information
    public void updateContact(Contact contact, String newPhoneNumber, String newEmailAddress, String[] newAddresses) {
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i][0].equalsIgnoreCase(contact.getName())) {
                // Update the contact information
                contacts[i][1] = newPhoneNumber;
                contacts[i][2] = newEmailAddress;
                contacts[i][3] = Integer.toString(newAddresses.length);
                contacts[i] = Arrays.copyOf(contacts[i], 4 + newAddresses.length);
                System.arraycopy(newAddresses, 0, contacts[i], 4, newAddresses.length);
                bubbleSortByName(numContacts);  // Use recursive bubble sort to sort the contacts array by name
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        // Print a message if the contact is not found
        System.out.println("Contact not found.");
    }

    // Method to display all contacts
    public void displayContacts() {
        if (numContacts == 0) {
            // Print a message if the contact list is empty
            System.out.println("Contact list is empty.");
            return;
        }
        // Display each contact's information
        System.out.println("Contact List:");
        for (int i = 0; i < numContacts; i++) {
            System.out.println("Name: " + contacts[i][0]);
            System.out.println("Phone Number: " + contacts[i][1]);
            System.out.println("Email Address: " + contacts[i][2]);
            System.out.println("Addresses:");
            for (int j = 4; j < 4 + Integer.parseInt(contacts[i][3]); j++) {
                System.out.println(contacts[i][j]);
            }
            System.out.println("--------------------");
        }
    }
}