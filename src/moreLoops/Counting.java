package moreLoops;


import java.util.Scanner;

//        Write a program that reads an integer from the user.
//        Next, the program prints numbers from 0 to the number given by the user.
//        You can assume that the user always gives a positive number. Below are some examples of the expected functionality.
public class Counting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("enter a number: ");
        int number = Integer.valueOf(reader.nextLine());

        for (int i= 0; i <= number; i++){
            System.out.println(i);
        }
    }
}
