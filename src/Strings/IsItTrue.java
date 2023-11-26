package Strings;

import java.util.Scanner;

//Write a program that asks the user for a string. If the user writes the string "true", the program prints "You got it right!", otherwise it prints "Try again!".
public class IsItTrue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a string: ");
        String word  = reader.nextLine();

        if(word.equals("true")){
            System.out.println("You got it right!");
        }else{
            System.out.println("Try again!");
        }
    }
}
