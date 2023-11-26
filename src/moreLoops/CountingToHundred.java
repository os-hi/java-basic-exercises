package moreLoops;

import java.util.Scanner;

//        Write a program, which reads an integer from the user.
//        Then the program prints numbers from that number to 100.
//        You can assume that the user always gives a number less than 100
public class CountingToHundred {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("enter a number: ");
        int number = Integer.valueOf(reader.nextLine());

        for (int i = number ; i<=100; i++){
            System.out.println(i);
        }
    }
}
