public class Contact {
    private String name;
    private String phoneNumber;
    private String[] addresses;

    public Contact(String name, String phoneNumber, String[] addresses) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.print("Addresses: ");
        for (String address : addresses) {
            System.out.print(address + " | ");
        }
        System.out.println("\n");
    }
}
