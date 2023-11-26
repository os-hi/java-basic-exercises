package Strings;

import java.util.Scanner;


//        Write a program that reads user input until an empty line.
//        For each non-empty string, the program splits the string by spaces   and then prints the pieces that contain av, each on a new line.

public class AVClub {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("enter a sentence: ");
        String sentence = reader.nextLine();

        String[] splitSentence = sentence.split(" ");
        for(int i =0; i< splitSentence.length; i++){
            if(splitSentence[i].contains("av")){
                System.out.println(splitSentence[i]);
            }
        }
    }
}
