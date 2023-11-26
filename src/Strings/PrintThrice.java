package Strings;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type a word: ");
        String word = reader.nextLine();

        for(int i =0; i<3;i++){
            System.out.print(word);
        }
    }
}
