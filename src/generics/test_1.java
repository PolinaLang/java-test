//3. Generics, lesson 1
package generics;

import java.util.ArrayList;
import java.util.List;

public class test_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("qwerty"));
        list.add("qwe");
        list.add("rty");
        list.add("asd");

        for (Object o : list) {
            System.out.println(o + " length: " + ((String)o).length());
        }
    }
}

