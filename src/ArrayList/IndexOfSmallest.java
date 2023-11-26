package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//
//        Write a program that reads numbers from the user. When number 9999 is entered,
//        the reading process stops. After this the program will print the smallest number in the list,
//        and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

public class IndexOfSmallest {
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
        int smallest = numbers.get(0);
        for(int i = 0; i<numbers.size(); i++){
            int number = numbers.get(i);
            if(smallest > number){
                smallest = number;

            }

        }
        System.out.println("the smallest number is: " + smallest);

        for(int i = 0; i<numbers.size();i++){
            if(smallest == numbers.get(i)){
                System.out.println("found at index " + i);
            }
        }
    }
}
