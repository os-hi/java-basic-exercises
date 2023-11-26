package methods;


import java.util.Scanner;

//  PART 1:     Create the following method in the exercise template: public static void printUntilNumber(int number).
//              It should print the numbers from one to the number passed as a parameter. Two examples of the method's usage are given below.

//  PART 2:     Create the following method in the exercise template: public static void printFromNumberToOne(int number).
//              It should print the numbers from the number passed as a parameter down to one. Two examples of the method's usage are given below.


public class FromOneToParameter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printUntilNumber(5);
        printFromNumberToOne(5);
    }
    public static void printUntilNumber(int number){
        for(int i = 1; i<=number;i++){
            System.out.println(i);
        }
    }
    public static void printFromNumberToOne(int number){
        for(int i = number; i>=1;i--){
            System.out.println(i);
        }
    }
}
