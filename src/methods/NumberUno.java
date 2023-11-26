package methods;

//Write a method public static int numberUno() that returns the value 1.
//Write a method public static String word(). The method must return a string of your choice.
public class NumberUno {
    public static void main(String[] args) {
        int number = numberUno();

        System.out.println("the number is:" + number);
        System.out.println(word() + " is pogi");
    }
    public static int numberUno(){

        return 1;
    }
    public static String word(){

        return "oshi";
    }
}
