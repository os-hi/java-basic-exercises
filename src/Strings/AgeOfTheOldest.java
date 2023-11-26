package Strings;

import java.util.Arrays;
import java.util.Scanner;


//        Write a program that reads names and ages from the user until an empty line is entered. The name and age are separated by a comma.
//        After reading all user input, the program prints the age of the oldest person.
//        You can assume that the user enters at least one person, and that one of the users is older than the others.
public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while(true){

            String input = reader.nextLine();

            if(input.isEmpty()){
                break;
            }
            String[] splitProfile = input.split(",");
            int age = Integer.parseInt(splitProfile[1]);
            String username = splitProfile[0];
            if(age > oldest){
                oldest = age;
                name = username;
            }

        }
        System.out.println("the oldest is " +name + " at age "+ oldest);

    }
}
