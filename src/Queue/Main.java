package Queue;

import java.util.LinkedList;
import java.util.Queue;


// FIFO = FIRST IN FIRST OUT
public class Main {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        names.offer("erika");
        names.offer("oshi");

        System.out.println(names);;

        System.out.println(names.peek());
    }
}
