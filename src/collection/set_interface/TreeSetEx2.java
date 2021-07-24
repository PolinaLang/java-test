//4. Коллекции, lesson 21
package collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student s1 = new Student("Sam", 21);
        Student s2 = new Student("Jon", 18);
        Student s3 = new Student("Robert", 25);
        Student s4 = new Student("Kate", 27);
        Student s5 = new Student("Sunnie", 23);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student s6 = new Student("Tom", 23);
        Student s7 = new Student("Ann", 20);
        //множество элементов с начала до s6
        System.out.println(treeSet.headSet(s6));
        //множество элементов с конца по s6 (включая s6)
        System.out.println(treeSet.tailSet(s6));
        //множество элементов от s7(включительно) и до s6
        System.out.println(treeSet.subSet(s7, s6));

        System.out.println(s5.equals(s6));
        System.out.println(s5.hashCode()==s6.hashCode());
    }
}

class Student implements Comparable<Student>{
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
    //т.к. сравнение в методе compareTo идет только по age, то и в методе equals и hashCode должна использоваться только переменная age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
