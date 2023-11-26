package repeatingFunctionality;


import java.util.Scanner;

//        Write a program that asks the user for input until the user inputs 0.
//        After this the program prints the amount of numbers inputted and the sum of the numbers.
//        The number zero does not need to be added to the sum, but adding it does not change the results.
public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true){
            System.out.printf("enter a number: ");
            int number = Integer.valueOf(reader.nextLine());

            if(number == 0 ){
                System.out.println("the sum is: " + sum);
                System.out.println("the total numbers inputted is: " + counter);
                break;
            }
            counter ++;
            sum += number;
        }
    }
}
