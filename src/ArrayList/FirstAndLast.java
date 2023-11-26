package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//        In the exercise template there is a program that reads inputs from the user and adds them to a list.
//        Reading is stopped once the user enters an empty string.
//
//        Modify the program to print both the first and the last values after the reading ends.
//        You may suppose that at least two values are read into the list.
public class FirstAndLast {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while(true){
            System.out.print("enter some names: ");
            String name = reader.nextLine();

            if(name.isEmpty()){
                System.out.println("the first and last names are: " + names.get(0) + " "+ names.get(names.size()-1));
                break;
            }
            names.add(name);
        }
    }
}
