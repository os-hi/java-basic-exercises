package repeatingFunctionality;

import java.util.Scanner;

//Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".
public class CarryOn {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Shall we carry on?");
            String answer = reader.nextLine();
            if(answer.equals("no")){
                break;
            }
        }
    }
}
