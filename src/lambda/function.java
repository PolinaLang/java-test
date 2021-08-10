package lambda;
import javax.swing.*;
import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

public class function {
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

        Function<Student, Double> f = student -> student.avgGrade;

        double result1 = avgOfSmth(students, student -> student.avgGrade);
        System.out.println(result1);

        double result2 = avgOfSmth(students, student -> (double)student.course);
        System.out.println(result2);

        double result3 = avgOfSmth(students, student -> (double)student.age);
        System.out.println(result3);
    }

    private static double avgOfSmth (List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s: list
             ) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }

}
