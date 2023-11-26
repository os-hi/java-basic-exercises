package OOP.Bank;

import java.util.ArrayList;

public class Account {
    String accountName;
    double accountBalance;
    public Account(String name, double amount) {
        this.accountName = name;
        this.accountBalance = amount;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    public double balance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return accountName + " balance: " + accountBalance;
    }
}
