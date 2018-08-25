package Constructors;

public class VipAccount {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipAccount() {
        this.name = "Bob";
        this.creditLimit = 1000;
        this.emailAdress = "bob@email.com";
    }

    public VipAccount(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = "email@email.com";
    }

    public VipAccount(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
