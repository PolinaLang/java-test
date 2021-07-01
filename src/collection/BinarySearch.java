package collection;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(12);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(-19);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int index = Collections.binarySearch(arrayList, 12);
        System.out.println(index);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        Employee emp1 = new Employee(100, "Bob", 1000);
        Employee emp2 = new Employee(220, "Alice", 800);
        Employee emp3 = new Employee(16, "Jon", 1200);
        Employee emp4 = new Employee(86, "Kate", 1500);
        Employee emp5 = new Employee(123, "Sam", 1100);
        Employee emp6 = new Employee(100, "Liz", 900);
        Employee emp7 = new Employee(91, "Frank", 700);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);

        int index_1 = Collections.binarySearch(employees, new Employee(123, "Sam", 1100));
        System.out.println(index_1);

        int[]array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index_2 = Arrays.binarySearch(array, 8);
        System.out.println(index_2);

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
