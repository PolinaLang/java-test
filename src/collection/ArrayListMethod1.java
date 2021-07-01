//4. Коллекции, lesson 3
package collection;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("cat");
        arrayList1.add("dog");
        arrayList1.add("bird");
        arrayList1.add(1, "cow");
//        for (String s : arrayList1
//             ) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }
        arrayList1.set(1, "fox");

        arrayList1.remove(0);

        System.out.println(arrayList1);
    }
}
