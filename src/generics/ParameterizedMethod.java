//3. Generics, lesson 3
package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        //ArrayList all = new ArrayList(); - как видит код JVM

        all.add(10);
        all.add(20);
        all.add(5);
        int a = GenMethod.getSecondElement(all);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("qwe");
        al2.add("asd");
        al2.add("zxc");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }
}

//параметризированный метод
class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}