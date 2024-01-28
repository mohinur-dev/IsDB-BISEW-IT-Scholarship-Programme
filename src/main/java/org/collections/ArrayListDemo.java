package org.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> aList1 = new ArrayList<>(20);
        ArrayList<Integer> aList2 = new ArrayList<>(List.of(50,60,70,80,90));
        aList1.add(10);
        aList1.add(0, 5);
        aList1.addAll(1, aList2);

//        aList1.forEach((n) -> {
//            System.out.println(n);
//        });

//        aList1.forEach(System.out :: println);

//        aList1.forEach(n -> show(n));

//        aList1.forEach(ArrayListDemo::show);

//        for (int i: aList1) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < aList1.size(); i++){
//            System.out.println(aList1.get(i));
//        }








//        System.out.println(aList1);
//        System.out.println(aList1.contains(16));
    }

    public static void show(int n) {
        if (n>= 60) {
            System.out.println(n);
        }
    }
}
