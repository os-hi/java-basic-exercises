package recurringProblems;


import java.util.Scanner;

//        Write a program that reads two integers from the user. If the first number is greater than the second,
//        the program prints "(first) is greater than (second)." If the first number is less than the second, the program prints "(first) is smaller than (second)."
//        Otherwise, the program prints "(first) is equal to (second)."
//        The (first) and (second) should always be replaced with the actual numbers that were provided by the user.
public class ComparingNumbers {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("enter your first number:");
        int firstNumber = Integer.valueOf(reader.nextLine());
        System.out.println("enter your second number:");
        int secondNumber = Integer.valueOf(reader.nextLine());

        if (firstNumber > secondNumber){
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is smaller than " + secondNumber);
        }else{
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
    }
}
