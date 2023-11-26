package Array;

import java.util.Scanner;

public class IndexNotFound {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] arrayOfNumbers = new int[5];

        arrayOfNumbers[0] = 42;
        arrayOfNumbers[1] = 13;
        arrayOfNumbers[2] = 12;
        arrayOfNumbers[3] = 7;
        arrayOfNumbers[4] = 1;

        for(int i=0; i<arrayOfNumbers.length; i++){
            System.out.println(arrayOfNumbers[i]);
        }
        System.out.print("search for? ");
        int index = reader.nextInt();

        boolean foundItem = false;
        int location = 0;
        for(int i=0; i<arrayOfNumbers.length; i++){

            if (arrayOfNumbers[i] == index) {
                foundItem = true;
                location = i;
                break;
            }
        }
        if(foundItem){
            System.out.println(index + " is found at " + location);
        }else{
            System.out.println(index + " not found");

        }
    }
}
