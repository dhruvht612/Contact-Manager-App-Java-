import java.util.*;

public class ContactManager {
    private Contact[] contacts = new Contact[100];
    int numContacts = 0;

    public void addContact(Contact contact) {
        if (numContacts < contacts.length) {
            contacts[numContacts++] = contact;
        } else {
            System.out.println("Contact list is full.");
        }
    }

    public void displayContacts() {
        if (numContacts == 0) {
            System.out.println("No contacts to display.");
            return;
        }
        for (int i = 0; i < numContacts; i++) {
            contacts[i].displayContact();
        }
    }

    public Contact binarySearchByName(String name) {
        mergeSortByName(contacts, 0, numContacts - 1);
        int left = 0, right = numContacts - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = contacts[mid].getName().compareToIgnoreCase(name);
            if (cmp == 0)
                return contacts[mid];
            if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public List<Contact> searchByPartialName(String partialName) {
        List<Contact> matches = new ArrayList<>();
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getName().toLowerCase().contains(partialName.toLowerCase())) {
                matches.add(contacts[i]);
            }
        }
        return matches;
    }

    public void updateContact(String name, String newPhone, String[] newAddresses) {
        Contact contact = binarySearchByName(name);
        if (contact != null) {
            contact.setPhoneNumber(newPhone);
            contact.setAddresses(newAddresses);
            System.out.println("Contact updated.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void sortByPhoneNumber() {
        Arrays.sort(contacts, 0, numContacts, Comparator.comparing(Contact::getPhoneNumber));
    }

    public void sortByAddressCount() {
        Arrays.sort(contacts, 0, numContacts, Comparator.comparingInt(c -> c.getAddresses().length));
    }

    public void mergeSortByName(Contact[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortByName(arr, left, mid);
            mergeSortByName(arr, mid + 1, right);
            mergeByName(arr, left, mid, right);
        }
    }

    private void mergeByName(Contact[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Contact[] L = new Contact[n1];
        Contact[] R = new Contact[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].getName().compareToIgnoreCase(R[j].getName()) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    public Contact[] getContacts() {
        return Arrays.copyOf(contacts, numContacts);
    }
}
