//4. Коллекции, lesson 12
package collection;

public class StackExample {

    static  void abc1(){
        System.out.println("abs1 start");
        System.out.println("abc1 end");
    }

    static void abc2() {
        System.out.println("abc2 start");
        abc1();
        System.out.println("abc2 end");
    }

    static void abc3() {
        System.out.println("abc3 start");
        abc2();
        System.out.println("abc3 end");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        abc3();
        System.out.println("main end");
    }
}
