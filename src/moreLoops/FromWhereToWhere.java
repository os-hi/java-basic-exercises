package moreLoops;

import java.util.Scanner;

//PART 1: Write a program which prints the integers from 1 to a number given by the user.
//PART 2: Ask the user for the starting point as well.
public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Where to? : ");
        int start = Integer.valueOf(reader.nextLine());
        System.out.printf("Where from? : ");
        int end = Integer.valueOf(reader.nextLine());

        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
