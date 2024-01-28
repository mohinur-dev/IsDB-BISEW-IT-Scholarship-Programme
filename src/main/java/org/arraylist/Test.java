package org.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(5);
        al.add("Shohidul");
        al.add("Mohinur");
        al.add("Arif");
        al.add("Shohidul");
        al.add("Mohinur");
        al.add("Arif");
        System.out.println(al.size());
    }
}
