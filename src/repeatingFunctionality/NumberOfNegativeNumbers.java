package repeatingFunctionality;

import java.util.Scanner;

//        Write a program that reads values from the user until they input a 0. After this,
//        the program prints the total number of inputted values that are negative.
//        The zero that's used to exit the loop should not be included in the total number count.
public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int counter = 0;

        while(true){
            System.out.printf("Input a number: ");
            int number = Integer.valueOf(reader.nextLine());

            if(number == 0){
                System.out.println("the total negative number inputted is: " + counter);
                break;
            }
            else if (number < 0){
                counter ++;
            }
        }
    }
}
