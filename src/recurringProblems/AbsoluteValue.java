package recurringProblems;

import java.util.Scanner;

//        Write a program that reads an integer from the user.
//        If the number is less than 0, the program prints the given integer multiplied by -1.
//        In all other cases, the program prints the number itself.
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("enter a number:");
        int number  = Integer.valueOf(reader.nextLine());

        if(number < 0 ){
            int value = number * -1;
            System.out.println("the value is:" + value);
        }else{
            System.out.println("the value is:" + number);
        }
    }
}
