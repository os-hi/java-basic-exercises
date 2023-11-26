package methods;

import java.util.Scanner;

// PART 1:       Write a method public static void division(int numerator, int denominator) that prints the result of the division of the numerator by the denominator.
//               Keep in mind that the result of the division of the integers is an integer — in this case we want the result to be a floating point number.

// PART 2:      Write a method public static void divisibleByThreeInRange(int beginning, int end)
//              that prints all the numbers divisible by three in the given range.
//              The numbers are to be printed in order from the smallest to the greatest.


public class Division {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        division(10, 2);
        divisibleByThreeInRange(2, 10);
    }
    public static void division(int numerator, int denominator){
        double quotient = (double) numerator / denominator;

        System.out.println(numerator + " divided by "+ denominator + " is "+ quotient);
    }
    public static void divisibleByThreeInRange( int beginning, int end){

        for (int num = beginning; num<= end; num++){
            if(num % 3 == 0){
                System.out.println(num);
            }
        }

    }
}
