//4. Коллекции, lesson 7
package collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Jon", 3);
        Student2 s2 = new Student2("Bob", 5);
        Student2 s3 = new Student2("Kate", 3);
        Student2 s4 = new Student2("Lize", 4);
        Student2 s5 = new Student2("Don", 2);

        LinkedList<Student2> student2s = new LinkedList<>();
        student2s.add(s1);
        student2s.add(s2);
        student2s.add(s3);
        student2s.add(s4);
        student2s.add(s5);

        System.out.println(student2s.get(2));
        Student2 s6 = new Student2("Karl", 2);
        student2s.add(1, s6);
        student2s.remove(3);
        System.out.println(student2s);

    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}