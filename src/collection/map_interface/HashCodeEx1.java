//4. Коллекции, lesson 14
package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student s1 = new Student("Morty", "Smith", 1);
        Student s2 = new Student("Summer", "Smith", 4);
        Student s3 = new Student("Jerry", "Smith", 0);
        map.put(s1, 7.5);
        map.put(s2, 8.9);
        map.put(s3, 5.0);
        System.out.println(map);

        Student s4 = new Student("Morty", "Smith", 1);
        boolean result = map.containsKey(s4);
        System.out.println("result " + result);
        //System.out.println(s1.equals(s4));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

//    @Override
//    public int hashCode() {
//        return name.length() * 7 + surname.length() * 11 + course * 53;
//    }
}