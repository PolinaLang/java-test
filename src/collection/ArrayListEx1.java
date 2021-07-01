//4. Коллекции, lesson 2
package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("cat");
        arrayList1.add("dog");
        arrayList1.add("bird");
        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>(50);
        List<String> list1 = new ArrayList<>();

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);

        System.out.println(arrayList1 == arrayList3);
    }
}
