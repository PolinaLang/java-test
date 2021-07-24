//4. Коллекции, lesson 20
package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("cat");
        set.add("dog");
        set.add("mouse");
        set.add("bird");
        set.add(null);

        set.remove("bird");
//        System.out.println(set);
        for (String s: set
             ) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("bird"));


    }
}
