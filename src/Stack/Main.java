package Stack;

import java.util.Stack;

// LIFO = LAST IN FIRST OUT
public class Main {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("erika");
        names.push("oshi");

        System.out.println(names);
        System.out.println(names.peek());
        names.pop();
        System.out.println(names);
    }
}
