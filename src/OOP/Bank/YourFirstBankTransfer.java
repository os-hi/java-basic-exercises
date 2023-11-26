package OOP.Bank;

import OOP.Bank.Account;

import java.util.Scanner;

//        Creates an account named "Matthews account" with the balance 1000
//        Creates an account named "My account" with the balance 0
//        Withdraws 100.0 from Matthew's account
//        Deposits 100.0 to "my account"
//        Prints both the accounts
public class YourFirstBankTransfer {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("create an account name: ");
        String mattName = reader.nextLine();
        System.out.print("enter the amount: ");
        double mattAmount = Double.parseDouble(reader.nextLine());
        Account matthew = new Account(mattName, mattAmount);

        System.out.print("create an account name: ");
        String myName = reader.nextLine();
//        myName = reader.nextLine();
        System.out.print("enter the amount: ");
        double myAmount = reader.nextDouble();
        Account myAccount = new Account(myName, myAmount);


        System.out.print("enter the amount to withdraw from matthew's account: ");
        double withdrawAmount = reader.nextDouble();
        matthew.withdraw(withdrawAmount);
        System.out.print("eneter the amount to deposit to my account: ");
        double depositAmount = reader.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.println("matthews account balance: " + matthew.balance());
        System.out.println("my account balance: " + myAccount.balance());


    }
}
