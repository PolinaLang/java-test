package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1 {
    public static void main (String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Kate");
        list.add("Max");
        list.add("Alex");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
