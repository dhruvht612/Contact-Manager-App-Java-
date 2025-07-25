public class PersonalContact extends Contact {
    private String email;
    private String birthday;

    public PersonalContact(String name, String phoneNumber, String[] addresses, String email, String birthday) {
        super(name, phoneNumber, addresses);
        this.email = email;
        this.birthday = birthday;
    }

    @Override
    public void displayContact() {
        super.displayContact();
        System.out.println("Email: " + email);
        System.out.println("Birthday: " + birthday);
        System.out.println();
    }
}
