//4. Коллекции, lesson 4
package collection;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("cat");
        arrayList1.add("dog");
        arrayList1.add("bird");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList2.add("+++");
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        System.out.println(arrayList2);
        arrayList2.clear();
        System.out.println(arrayList2);

        System.out.println(arrayList1.indexOf("dog"));

        System.out.println(arrayList2.isEmpty());

        System.out.println(arrayList1.contains("bird"));
    }
}
