package org.streammethode;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(7);
            list.add(8);
            list.add(9);
        System.out.println(list);
//        List<Integer> list2 = list.stream().filter(i -> i%2 != 0).toList();
//        System.out.println(list2);

        List<Integer> list2 = list.stream().map(i -> i + 5).toList();
        System.out.println(list2);
    }
}
