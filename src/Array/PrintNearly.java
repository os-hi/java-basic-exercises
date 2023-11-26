package Array;

//        Complete the method public static void printNeatly(int[] array)
//        in the class named 'ArrayPrinter' to make it print the numbers of the array it receives more neatly.
//        There should be a whitespace and a comma between each number. don't put a comma after the last number.
//
//        Print the numbers on one line using System.out.print.

public class PrintNearly {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] array){
        if(array.length > 0){
            for(int i = 0; i <array.length-1;i++){
                System.out.print(array[i] + ",");
            }
            System.out.print(array[array.length-1]);
        }
    }
}
