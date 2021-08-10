package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo1 {
    void testStudents (ArrayList<Student> al, Predicate<Student> sc) {
        for (Student s: al
             ) {
            if (sc.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
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

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'f';

        StudentInfo1 info = new StudentInfo1();

//        info.testStudents(students, p1.and(p2));
//        info.testStudents(students, p1.or(p2));
        info.testStudents(students, p1.negate());

//        //анонимный класс
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course - o2.course;
//            }
//        });
//        //лямбда выражение
//        Collections.sort(students, (st1, st2) -> st1.course - st2.course);
//

//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("---------------------------");
//        //анонимный класс
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
//        System.out.println("---------------------------");
        //lambda - выражение
//        info.testStudents(students, (Student s) -> {
//            System.out.println("text");
//            return s.age < 30;}) ;
//
//        info.testStudents(students, s -> s.age < 30) ;
//
////        StudentChecks sc = (Student s) -> {return s.age < 30; };
////        info.testStudents(students, sc);
//
//        info.testStudents(students, (Student s) -> {
//            return s.avgGrade > 8;});
//
//        info.testStudents(students, (Student s) -> {
//            return s.age < 24 && s.avgGrade < 9 && s.sex == 'f';});
//
//    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}
//
//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
}