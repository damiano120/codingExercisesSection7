package Constructors;

public class Account extends Bank {

    public Account(String accountNumber, double balance, String customerName, String numberTelephone, String emailAdress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.numberTelephone = numberTelephone;
        this.emailAdress = emailAdress;
    }

    private String accountNumber;
    private double balance;
    private String customerName;
    private String numberTelephone;
    private String emailAdress;

    public double depositFunds(double value){

        if (value>0)
            this.balance+=value;
        else
            System.out.println("Deposit error");
        return this.balance;
    }

    public double withdrawFunds(double value){

        if (value>this.balance)
            System.out.println("Error, value is invalid. Your balance is: "+this.balance);
        if(value<0)
            System.out.println("Withraw error");
        else
            this.balance-=value;
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getNumberTelephone() {
        return numberTelephone;
    }
    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }
    public String getEmailAdress() {
        return emailAdress;
    }
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
