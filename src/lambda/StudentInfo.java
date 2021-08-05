package lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student("Kate", 'f', 22, 2, 8.4);
        Student s2 = new Student("Max", 'm', 21, 1, 6.4);
        Student s3 = new Student("Alex", 'm', 23, 3, 8.1);
        Student s4 = new Student("Zoi", 'f', 24, 4, 7.3);
        Student s5 = new Student("Piter", 'm', 25, 5, 9.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        StudentInfo info = new StudentInfo();
//        info.printStudentOverGrade(students, 8);
//        info.printStudentUnderAge(students, 24);
        info.printStudentMixCondition(students, 22, 9, 'f');

    }

    void printStudentOverGrade(ArrayList<Student> al, double grade) {
        for (Student s:al
             ) {
            if(s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> al, int age) {
        for (Student s:al
             ) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student s:al
             ) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
