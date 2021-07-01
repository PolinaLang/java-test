//3. Generics, lesson 7
package generics;

import java.util.ArrayList;
import java.util.List;

public class Test_3 {
    public static void main(String[] args) {
//компилятор ругается на несоответствие типов
//        List<Number> list1 = new ArrayList<Integer>();
//        List<Object> list2 = new ArrayList<Integer>();
//? - wild card
        List<?> list3 = new ArrayList<Integer>();
//        list3.add(123); - при использовании wild card параметра нельзя изменять объект

        List<? extends Number> list4 = new ArrayList<Integer>();
        List<? super Number> list5 = new ArrayList<Object>();

        List<Double> list_d = new ArrayList<>();
        list_d.add(1.12);
        list_d.add(2.34);
        showListInfo(list_d);

        List<String> list_s = new ArrayList<>();
        list_s.add("qwe");
        list_s.add("asd");
        showListInfo(list_s);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(1.12);
        ald.add(2.34);
        System.out.println(summ(ald));

        ArrayList<Integer> alq = new ArrayList<>();
        alq.add(12);
        alq.add(34);
        System.out.println(summ(alq));
    }

    static void showListInfo(List<?> list) {
        System.out.println("List includes values: " + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double summ = 0;
        for (Number n : arrayList) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
