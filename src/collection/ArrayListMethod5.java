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
        System.out.println(arrayList1); //[cat, dog, bird]

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("cat-2");
        arrayList2.add("dog");
        arrayList2.add("bird-2");

//        arrayList1.retainAll(arrayList2);
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1); //[dog]

        //метод of - статичный, изменять объект нельзя
        List<Integer> list1 = List.of(3, 8, 31);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

        //sublist = view
        List<String> myList = arrayList1.subList(1, 2);
        System.out.println(myList); //[bird]
        myList.add("mouse");
        System.out.println(myList); //[bird, mouse]
        System.out.println(arrayList1); //[cat, bird, mouse]
        arrayList1.add("frog");
        System.out.println(arrayList1); //[cat, bird, mouse, frog]

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
