package repeatingFunctionality;

import java.util.Scanner;

//        Write a program that asks the user for numbers. If the number is negative (smaller than zero),
//        the program prints for user "Unsuitable number" and asks the user for a new number.
//        If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two.
public class OnlyPositives {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.printf("input some numbers: ");
            int number = Integer.valueOf(reader.nextLine());

            if(number == 0 ){
                break;
            }
            else if(number < 0){
                System.out.println("Unsuitable number");
                continue;
            }
            System.out.println("the result is" + Math.pow(number, 2));
        }
    }
}
