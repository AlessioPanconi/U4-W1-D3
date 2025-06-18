package Ese3;

import java.util.Random;

public class Customer {

    private final int customerCode;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private String registrationDate;

    // Costruttore
    public Customer(String customerName, String customerSurname, String customerEmail, String registrationDate) {
        Random rndm = new Random();
        this.customerCode = rndm.nextInt(1, 10000);
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerEmail = customerEmail;
        this.registrationDate = registrationDate;
    }

    // Getter
    public int getCustomerCode() {
        return customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    // Setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
}

