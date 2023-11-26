package Array;


//        The class SumOfArray has a method public static int sumOfNumbersInArray(int[] array).
//        Complete the method so that it computes and returns the sum of the numbers in the array it receives as parameter.
public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }
    public static int sumOfNumbersInArray(int[] array){
        int sum =  0;
        for(int i = 0; i<array.length;i++){
            sum += array[i];

        }
        return sum;
    }
}
