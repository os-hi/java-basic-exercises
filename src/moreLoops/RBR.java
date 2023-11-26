package moreLoops;

import java.util.Scanner;

//
//        Next, we'll implement a program one piece at a time. This is always strongly recommended when coding.
//
//        The series of exercises form a larger program whose functionality is implemented in small pieces.
//        If you do not finish the whole series, you can still submit the parts you've completed to be checked.
//        This can be done by clicking the "submit" button (the arrow pointing up) to the right of the "test" button.
//        Although the submission system complains about the tests of unfinished parts, you get points for the parts you have finished.
//
//        NB: Remember that each sub-part of the series is equivalent to one individual exercise. As such, the series is equivalent to five individual exercises.
//
//        Note: the tests might fail a correct solution. This is a known bug that will be fixed in the future.
//        In the meantime, you can avoid the error by printing "Give numbers:" without any spaces after ':'

//        PART 1: Implement a program that asks the user for numbers (the program first prints "Write numbers: ")
//        until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.
//        PART 2: Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.
//        PART 3: Extend the program so that it also prints the number of numbers (not including the -1) the user has written.
//        PART 4: Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.
//        PART 5: Extend the program so that it prints the number of even and odd numbers (excluding the -1).



public class RBR {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        double average = 0;
        int oddCounter = 0;
        int evenCounter = 0;

        System.out.printf("write number: ");
        while(true){
            int number = reader.nextInt();

            if(number == -1) {
                System.out.println("Tnx! Bye!");
                System.out.println("the sum is: " + sum);
                System.out.println("the number of numbers is: " + counter);
                System.out.println("the average is: " + average);
                System.out.println("the odd number is: " + oddCounter);
                System.out.println("the even is: " + evenCounter);
                break;
            }
            if (number % 2 == 0){
                evenCounter++;
            }else{
                oddCounter++;
            }
            counter ++;
            sum += number;
            average = (double) sum / counter;
        }

    }
}
