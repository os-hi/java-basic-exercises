package repeatingFunctionality;

import java.util.Scanner;

//Write a program, according to the preceding example, that asks the user to input values until they input the value 4.


public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.println("enter a number:");
            int number  = Integer.valueOf(reader.nextLine());

            if(number == 4){
                break;
            }
        }
    }
}
