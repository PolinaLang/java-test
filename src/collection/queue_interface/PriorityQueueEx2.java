//4. Коллекции, lesson 24
package collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student s1 = new Student("Morty", 1);
        Student s2 = new Student("Summer", 4);
        Student s3 = new Student("Jerry", 2);
        Student s4 = new Student("Morty", 3);
        Student s5 = new Student("Summer", 5);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(s1);
        priorityQueue.add(s2);
        priorityQueue.add(s3);
        priorityQueue.add(s4);
        priorityQueue.add(s5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}

class Student implements Comparable<Student>{
    String name;
    Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}