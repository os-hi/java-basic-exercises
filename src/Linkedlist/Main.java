package Linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("oshi");
        names.add("erika");
        String getName = names.get(0);

        System.out.println(names + " and "+ getName);

    }
}
