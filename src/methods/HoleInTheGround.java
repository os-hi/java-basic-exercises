package methods;

import java.util.Scanner;

// PART 1: Create a method called printText which prints the phrase "In a hole in the ground there lived a method" and a newline.
// PART 2: Expand the previous program so that the main program asks the user for the number of times the phrase will be printed (i.e. how many times the method will be called).
public class HoleInTheGround {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("enter a number: ");
        int number = reader.nextInt();

        for(int i = 0 ; i < number; i++){
            printText();
        }

    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
}
