import java.util.*;

public class ContactManagerApp_FEU_2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search by Name (Binary Search)");
            System.out.println("4. Search by Partial Name");
            System.out.println("5. Update Contact");
            System.out.println("6. Sort by Name (Merge Sort)");
            System.out.println("7. Sort by Phone Number");
            System.out.println("8. Sort by Address Count");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Number of addresses: ");
                    int numAddresses = scanner.nextInt();
                    scanner.nextLine();
                    String[] addresses = new String[numAddresses];
                    for (int i = 0; i < numAddresses; i++) {
                        System.out.print("Address " + (i + 1) + ": ");
                        addresses[i] = scanner.nextLine();
                    }
                    Contact newContact = new Contact(name, phone, addresses);
                    manager.addContact(newContact);
                    break;

                case 2:
                    manager.displayContacts();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Contact found = manager.binarySearchByName(searchName);
                    if (found != null) {
                        found.displayContact();
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter partial name: ");
                    String partial = scanner.nextLine();
                    List<Contact> matches = manager.searchByPartialName(partial);
                    if (matches.isEmpty()) {
                        System.out.println("No matches found.");
                    } else {
                        for (Contact c : matches) {
                            c.displayContact();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Name of contact to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("New phone: ");
                    String newPhone = scanner.nextLine();
                    System.out.print("Number of new addresses: ");
                    int newAddressCount = scanner.nextInt();
                    scanner.nextLine();
                    String[] newAddresses = new String[newAddressCount];
                    for (int i = 0; i < newAddressCount; i++) {
                        System.out.print("New Address " + (i + 1) + ": ");
                        newAddresses[i] = scanner.nextLine();
                    }
                    manager.updateContact(updateName, newPhone, newAddresses);
                    break;

                case 6:
                    Contact[] sorted = manager.getContacts();
                    manager.mergeSortByName(sorted, 0, sorted.length - 1);
                    System.out.println("Sorted by name:");
                    for (Contact c : sorted) {
                        c.displayContact();
                    }
                    break;

                case 7:
                    manager.sortByPhoneNumber();
                    System.out.println("Sorted by phone number.");
                    break;

                case 8:
                    manager.sortByAddressCount();
                    System.out.println("Sorted by address count.");
                    break;

                case 9:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
