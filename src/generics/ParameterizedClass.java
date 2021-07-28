//3. Generics, lesson 2
package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s1 = info1.getValue();

        Info<Integer> info2 = new Info<>(123);
        System.out.println(info2);
        Integer s2 = info2.getValue();
    }
//    public void abc (Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc (Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}
//T - type holder
//class Info <T extends Number>  - дженерик с ограничением по типу
//3. Generics, lesson 5
//class Info <T extends Number&I1&I2> - имплементит два интерфейса
class Info <T> {
    private  T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return "{[ " + value +" ]}";
    }

    public T getValue() {
        return value;
    }
}

//3. Generics, lesson 6
//class Parent {
//    public void abc (Info<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent{
//    public void abc (Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//}


interface I1 {}
interface I2 {}
