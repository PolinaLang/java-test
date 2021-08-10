package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class removeIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("text 1");
        al.add("text 12");
        al.add("text");
        al.add("text 123");
        System.out.println(al);

        al.removeIf(element -> element.length()>6);

        Predicate<String> p = element -> element.length() >6;
        al.removeIf(p);

        System.out.println(al);
    }
}
