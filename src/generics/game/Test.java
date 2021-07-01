//3. Generics, lesson 4
package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mary", 15);
        Schoolar schoolar3 = new Schoolar("Rome", 10);
        Schoolar schoolar4 = new Schoolar("Alex", 11);

        Student student1 = new Student("Nikolya", 20);
        Student student2 = new Student("Kate", 18);

        Employee employee1 = new Employee("Mike", 25);
        Employee employee2 = new Employee("Sara", 30);

        Team<Schoolar> schoolarTeam1 = new Team<>("Dragons");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Rocks");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Workers");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Cats");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam1.playWith(schoolarTeam2);
    }
}
