package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//        In the exercise template there is a program that reads inputs from the user and adds them to a list.
//        Reading is stopped once the user enters an empty string.
//
//        Your task is to modify the method to print the last read value after it stops reading.
//        Print the value that was read last from the list. Use the method that tells the size of a list to help you.
public class LastInList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        while(true){
            System.out.print("type some names: ");
            String name = reader.nextLine();

            if(name.isEmpty()){

                System.out.println("the total is: " + names.get(names.size()-1));
                break;
            }
            names.add(name);
        }
    }
}
