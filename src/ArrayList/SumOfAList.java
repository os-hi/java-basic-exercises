package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.
//When reading ends, calculate the average of the numbers in it, and then print that value.
public class SumOfAList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        double average = 0;
        while(true){
            System.out.print("enter some numbers: ");
            int number = reader.nextInt();

            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        for(int i = 0 ; i<numbers.size();i++){
            sum += numbers.get(i);
        }

        average = (double) sum / numbers.size();
        System.out.println("sum is: " +sum);
        System.out.println("average is: " + average);
    }
}
