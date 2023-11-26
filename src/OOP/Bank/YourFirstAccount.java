package OOP.Bank;

import OOP.Bank.Account;

//Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. NB! Perform all the operations in this exact order.
public class YourFirstAccount {
    public static void main(String[] args) {
        Account bankAccount = new Account("oshi's bank account", 100.0);

        bankAccount.deposit(20.0);

        System.out.println("the balance is " +bankAccount.balance());
    }
}
