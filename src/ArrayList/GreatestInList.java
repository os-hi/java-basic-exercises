package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//
//        The exercise template contains a base that reads numbers from the user and adds them to a list.
//        Reading isstopped once the user enters the number -1.
//
//        Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers.
//        The programming should work in the following manner.

public class GreatestInList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            System.out.print("enter some numbers: ");
            int number = reader.nextInt();

            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        int greatest = numbers.get(0);

        for(int i = 0; i<numbers.size(); i++){
            int number = numbers.get(i);
            if(greatest < number){
                greatest = number;
            }
        }
        System.out.println("the greatest number is: " + greatest);
    }
}
