package generics.game;

public abstract class Participant {
    private String name;
    private int age;

    //конструктор
    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
