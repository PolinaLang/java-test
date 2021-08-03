//4. Коллекции, lesson 17
package collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student s1 = new Student("Morty", "Smith", 1);
        Student s2 = new Student("Summer", "Smith", 4);
        Student s3 = new Student("Jerry", "Smith", 0);
        Student s4 = new Student("Morty", "Smith", 1);
        Student s5 = new Student("Summer", "Smith", 4);
        Student s6 = new Student("Jerry", "Smith", 0);
        Student s7 = new Student("Morty", "Smith", 1);

        treeMap.put(5.8, s1);
        treeMap.put(5.0, s2);
        treeMap.put(9.1, s3);
        treeMap.put(3.7, s4);
        treeMap.put(1.7, s5);
        treeMap.put(4.9, s6);
        treeMap.put(8.6, s7);

        System.out.println(treeMap);
        System.out.println(treeMap.get(3.7));
        treeMap.remove(5.0);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(5.0));
        System.out.println(treeMap.headMap(5.0));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

        TreeMap<Student, Double> treeMap_2 = new TreeMap<>();
        Student st1 = new Student("Morty", "Smith", 1);
        Student st2 = new Student("Summer", "Smith", 4);
        Student st3 = new Student("Jerry", "Smith", 0);

        treeMap_2.put(st1, 3.6);
        treeMap_2.put(st2, 7.6);
        treeMap_2.put(st3, 9.6);

//        System.out.println(treeMap_2);

        TreeMap<Student, Double> treeMap_3 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
    }
}
