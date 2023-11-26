package Strings;


import java.util.Scanner;

//        Write a program that reads strings from the user. If the input is empty, the program stops reading input and halts.
//        For each non-empty input it splits the string input by whitespaces   and prints each part of the string on a new line.
public class LineByLine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("enter a sentence: ");
        String sentence = reader.nextLine();

        String[] splitSentence = sentence.split(" ");

        for(int i=0; i<splitSentence.length; i++){
            System.out.println(splitSentence[i]);
        }
    }
}
