public class BusinessContact extends Contact {
    private String company;
    private String jobTitle;

    public BusinessContact(String name, String phoneNumber, String[] addresses, String company, String jobTitle) {
        super(name, phoneNumber, addresses);
        this.company = company;
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayContact() {
        super.displayContact();
        System.out.println("Company: " + company);
        System.out.println("Job Title: " + jobTitle);
        System.out.println();
    }
}
