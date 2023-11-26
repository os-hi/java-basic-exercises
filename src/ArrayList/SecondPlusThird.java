package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//        In the exercise template there is a program that reads integers from the user and adds them to a list.
//        This ends when the user enters 0. The program then prints the first value on the list.
//
//        Modify the program so that instead of the first value, the program prints the sum of the second and third numbers.
//        The program is allowed to malfunction if there are fewer than three entries on the list, so you don't need to prepare for such an event at all.
public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();


        while(true){
            System.out.print("ENTER NUMBERS: ");
            int number = reader.nextInt();

            if(number == 0){
                int firstNumber = numbers.get(1);
                int secondNumber = numbers.get(2);
                int sum = firstNumber + secondNumber;
                System.out.println("the sum is " +  sum);
                break;
            }
            numbers.add(number);
        }
    }
}
