package repeatingFunctionality;


import java.util.Scanner;

//        Write a program that reads numbers from the user until the user inputs a number 0.
//        After this the program outputs the sum of the numbers.
//        The number zero does not need to be added to the sum, even if it does not change the results.
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.printf("input a number: ");
            int number = Integer.valueOf(reader.nextLine());

            if( number == 0 ){
                System.out.println("the sum of the inputted numbers is: " + sum);
                break;
            }
            sum += number;
        }
    }
}
