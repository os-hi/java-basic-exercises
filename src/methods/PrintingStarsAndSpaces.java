package methods;


//      PART 1:  Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break.
//               You will also have to either copy the printStars method from your previous exercise or reimplement it in this exercise template.

//      PART 2:  Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle.
//               So the method call printTriangle(4) should print the following:

//      PART 3:  Define a method called christmasTree(int height) that prints the correct Christmas tree.
//               The Christmas tree consists of a triangle with the specified height as well as the base.
//               The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom.
//               The tree is to be constructed by using the methods printSpaces and printStars.
public class PrintingStarsAndSpaces     {
    public static void main(String[] args) {
        christmasTree(7); // You can replace 5 with the desired height of the tree
    }

    // Method to print spaces
    private static void printSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    // Method to print stars
    private static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }
    private static void printTriangle(int height){
        for(int i = 1; i <=height; i++){
            printSpaces(height - i);
            printStars(i);
            System.out.println();
        }
    }


    // Method to print the Christmas tree
    private static void christmasTree(int height) {
        // Print the triangle
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println(); // Move to the next line
        }

        // Print the base
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.println(); // Move to the next line
        }
    }
}
