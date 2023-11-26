package repeatingFunctionality;

import java.util.Scanner;

//        Write a program that asks the user for input until the user inputs 0.
//        After this, the program prints the average of the positive numbers (numbers that are greater than zero).
//
//        If no positive number is inputted, the program prints "Cannot calculate the average"
public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        float average = 0;

        while(true){
            System.out.printf("enter a number: ");
            int number = Integer.valueOf(reader.nextLine());

            if(number == 0){
                if(counter != 0){
                    System.out.println("the average positive numbers inputted is: " + average);
                    break;
                }
                System.out.println("Cannot calculate the average");
                break;

            }
            else if( number > 0){
                counter ++;
                sum += number;
                average = (float) sum / counter;
                continue;
            }
        }
    }
}
