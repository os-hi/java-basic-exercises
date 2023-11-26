package moreLoops;

import java.util.Scanner;

//Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
public class SumOfSequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        System.out.printf("first number: ");
        int start = Integer.valueOf(reader.nextLine());
        System.out.printf("last number: ");
        int end = Integer.valueOf(reader.nextLine());

        for (int i = start; i <= end; i++){
            sum += i;
        }

        System.out.println("sum is: " + sum);
    }
}
