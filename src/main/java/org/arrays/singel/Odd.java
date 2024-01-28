package org.arrays.singel;

public class Odd {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 3};
        findOddNumber(array);
    }
    public static void findOddNumber(int[] arr) {
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
