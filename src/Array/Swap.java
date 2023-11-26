package Array;

import java.util.Scanner;

//        The exercise template already contains a program, that creates an array and prints the values of the array twice.
//        Modify the program to do following: After the first printing, the program should ask for two indices from the user.
//        The values in these two indices should be swapped, and in the end the values of the array should be printed once again.
public class Swap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] arrayOfNumbers = new int[5];

        arrayOfNumbers[0] = 42;
        arrayOfNumbers[1] = 13;
        arrayOfNumbers[2] = 12;
        arrayOfNumbers[3] = 7;
        arrayOfNumbers[4] = 1;


        for(int i = 0; i<arrayOfNumbers.length;i++){
            System.out.println(arrayOfNumbers[i]);
        }

        System.out.print("enter the first index: ");
        int firstIndex = reader.nextInt();
        System.out.print("enter the second index: ");
        int secondIndex = reader.nextInt();


        int helper = arrayOfNumbers[firstIndex];
        arrayOfNumbers[firstIndex] = arrayOfNumbers[secondIndex];
        arrayOfNumbers[secondIndex]= helper;

        for(int i = 0; i<arrayOfNumbers.length;i++){
            System.out.println(arrayOfNumbers[i]);
        }

    }
}
