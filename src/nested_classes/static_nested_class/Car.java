package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObject);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        private int horsePower;
        static int countOfObject;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObject++;
        }

        @Override
        public String toString() {
            return "Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        Car car = new Car("red", 2, e);
        System.out.println(car);
        car.method();
    }
}
