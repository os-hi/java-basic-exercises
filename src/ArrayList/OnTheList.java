package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//        In the exercise template there is a program that reads inputs from the user until an empty string is entered.
//        Add the following functionality to it: after reading the inputs one more string is requested from the user.
//        The program then tell whether that string was found in the list or not.
public class OnTheList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while(true){
            System.out.print("enter some names: ");
            String name = reader.nextLine();

            if(name.isEmpty()){
                break;
            }
            names.add(name);
        }
        System.out.print("search for? ");
        String name = reader.nextLine();

        for(int i = 0; i<names.size();i++){
            if(names.get(i).equals(name)){
                System.out.println(name + " was found!");
            }
        }
    }
}
