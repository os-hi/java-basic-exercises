package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//        The exercise template contains a base that reads numbers from the user and adds them to a list.
//        Reading is stopped once the user enters the number -1.
//
//  PART 1:  Expand the functionality of the program so that after reading the numbers, it prints all the numbers received from the user.
//           The number used to indicate stopping should not be printed.
//  PART 2:  Expand the program to ask for a start and end indices once it has finished asking for numbers.
//           After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive).
//           You may assume that the user gives indices that match some numbers in the list.

public class RememberTheseNumbers {
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
        System.out.print("from where? ");
        int firstIndex = reader.nextInt();
        System.out.print("to where? ");
        int lastIndex = reader.nextInt();

        for(int i = firstIndex; i <= lastIndex; i++){
            System.out.println(numbers.get(i));
        }
    }

}
