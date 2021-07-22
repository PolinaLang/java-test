//4. Коллекции, lesson 18
package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student s1 = new Student("Morty", "Smith", 1);
        Student s2 = new Student("Summer", "Smith", 4);
        Student s3 = new Student("Jerry", "Smith", 0);

        linkedHashMap.put(7.2, s3);
        linkedHashMap.put(7.5, s1);
        linkedHashMap.put(1.7, s2);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(7.2));
        System.out.println(linkedHashMap.get(1.7));

        System.out.println(linkedHashMap);
    }
}
