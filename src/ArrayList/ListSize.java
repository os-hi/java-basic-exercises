package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//        In the exercise template is a program that reads input from the user.
//        Modify its working so that when the program quits reading, the program prints the number of values on the list.
public class ListSize {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        while(true){
            System.out.print("type some names: ");
            String name = reader.nextLine();

            if(name.isEmpty()){

                System.out.println("the total is: " + names.size());
                break;
            }
            names.add(name);
        }

    }
}
