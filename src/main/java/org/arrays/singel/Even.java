package org.arrays.singel;

public class Even {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 3};
        findEvenNumber(array);
    }
    public static void findEvenNumber(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
