package HashMaps;

import java.util.HashMap;
public class Main {

    public static  void main(String[] args) {

        HashMap<String, Integer> studentId = new HashMap<>();

        studentId.put("erika", 123);
        studentId.put("oshi", 321);

        studentId.get("erika");
        studentId.remove("oshi");


        System.out.println(studentId);
    }

}