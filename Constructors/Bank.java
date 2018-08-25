package Constructors;

import Constructors.Account;

public class Bank {

    // Cwiczenie konstruktorów na przykładzie konta bankowego

    public static void main(String[] args) {

        Account customer = new Account("0123 4567 8901", 0, "Tim Bowly", "123 456 789", "tim.bowly@email.com");

        customer.depositFunds(1486.54);
        System.out.println(customer.getBalance());
        customer.withdrawFunds(758.42);
        System.out.println(customer.getBalance());
        customer.withdrawFunds(245.32);
        System.out.println(customer.getBalance());
        System.out.println();

        VipAccount vipCustomer=new VipAccount("Kate", 5000, "kate@email.com");
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAdress());

    }
}
