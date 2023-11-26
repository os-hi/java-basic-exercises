package Strings;

import java.util.Scanner;

//        Write a program that reads user input until an empty line is entered.
//        For each non-empty line the program splits the string by spaces   and prints the first part of the string.
public class FirstWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true){
            String input = reader.nextLine();
            if(input.equals(" ")){
                break;
            }
            String[] splitSentece = input.split(" ");
            System.out.println(splitSentece[0]);
        }
    }
}
