package repeatingFunctionality;

import java.util.Scanner;

//        Write a program that asks the user for input until the user inputs 0.
//        After this, the program prints the average of the numbers.
//        The number zero does not need to be counted to the average.
//        You may assume that the user inputs at least one number.
public class AverageNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        float average = 0;
        int counter = 0;

        while(true){
            System.out.printf("Enter a number: ");
            int number = Integer.valueOf(reader.nextLine());

            if( number == 0 ){
                System.out.println("the average is: " + average);
                break;
            }
            counter ++;
            sum += number;
            average = (float) sum / counter;
        }
    }
}
