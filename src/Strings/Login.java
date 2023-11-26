package Strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("username: ");
        String username = reader.nextLine();
        System.out.print("passowrd: ");
        String password = reader.nextLine();

        if(username.equals("alex") && password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        }
        else if(username.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect Input!");
        }



    }
}
