//4. Коллекции, lesson 5
package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("cat");
        arrayList1.add("dog");
        arrayList1.add("bird");
        System.out.println(arrayList1);

        //метод of - статичный, изменять объект нельзя
        List<Integer> list1 = List.of(3, 8, 31);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

        //sublist = view
        List<String> myList = arrayList1.subList(1, 2);
        System.out.println(myList);
        myList.add("mouse");
        System.out.println(myList);
        System.out.println(arrayList1);
        arrayList1.add("frog");
        System.out.println(arrayList1);

        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]);

        for (String s: array2
             ) {
            System.out.println(s);
        }

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("cow");
//        arrayList2.add("cat");
//        arrayList2.add("otter");
//        System.out.println(arrayList2);

//        arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }
}
