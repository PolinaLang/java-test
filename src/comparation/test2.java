//2. Интерфейсы Comparable и Comparator, lesson 2-3
package comparation;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        List <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Max", "Petrov", 12345);
        Employee emp2 = new Employee(15, "Alex", "Dove", 6542);
        Employee emp3 = new Employee(122, "Kate", "Test", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n"+ list);
//        Collections.sort(list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting \n"+ list);

        Arrays.sort(new Employee[] {emp1, emp2, emp3});
    }
}

class Employee implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    int salary;

    //alt+ins
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee another) {
    //если текущий объект больше объекта в параметре - положительное, меньше - отрицательное, равны - 0
        if (this.id == another.id) {
            return 0;
        }
        else  if (this.id < another.id) {
            return -1;
        }
        else {
            return 1;
        }
        //другой вариант сортировки по id
//        return this.id - another.id;

        //сортировка по имени
//        return this.name.compareTo(another.name);

        //сортировка по имени, если имена одинаковые, то сортировка по фамилии
//        int res = this.name.compareTo(another.name);
//        if (res == 0) {
//            res = this.surname.compareTo(another.surname);
//        }
//        return res;
    }
}

//class IDComparator implements Comparator<Employee> {
//    @Override
//    public int compare (Employee emp1, Employee emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        }
//        else  if (emp1.id < emp2.id) {
//            return -1;
//        }
//        else {
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare (Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare (Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}