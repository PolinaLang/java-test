//4. Коллекции, lesson 19
package collection.map_interface;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Double, Student> h1 = new Hashtable<>();
        Student s1 = new Student("Morty", "Smith", 1);
        Student s2 = new Student("Summer", "Smith", 4);
        Student s3 = new Student("Jerry", "Smith", 0);

        h1.put(7.8, s1);
        h1.put(1.8, s2);
        h1.put(6.0, s3);
        System.out.println(h1);
    }
}
