//4. Коллекции, lesson 13
package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Jon Snow");
        map1.put(2569, "Kate Wolf");
        map1.put(6574, "Jack Wolfskin");
        map1.put(8730, "Ann Dawson");
        //елемент не добавляется, т.к. такой ключ уже существует
        map1.putIfAbsent(1000, "Person");

        System.out.println(map1);
        //System.out.println(map1.get(1000));
        map1.remove(1000);
        System.out.println(map1);
        System.out.println(map1.containsValue("Kate Wolf"));
        System.out.println(map1.containsKey(2569));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Alex", "One");
    }
}
