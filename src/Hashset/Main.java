package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("erika");
        names.add("oshi");
        names.add("denver");
        names.add("aluba");
        names.add("babu");

        System.out.println(names);


        for(String name : names){
            System.out.println(name);
        }
        System.out.println("iterator inseting...");

        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
    }
}
