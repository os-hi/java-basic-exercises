package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


//        Expand the program by adding a functionality that asks the user for a number,
//        and reports that number's index in the list. If the number is not found, the program should not print anything.

public class IndexOf {
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
        System.out.print("find the index of: ");
        int number = reader.nextInt();

        for(int i = 0; i <numbers.size();i++){
            if(number == numbers.get(i)){
                System.out.println(number + " is at index " + i);
            }
        }
    }
}
