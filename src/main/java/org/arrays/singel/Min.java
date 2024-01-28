package org.arrays.singel;

public class Min {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 3};
        System.out.println("min number is " + minNumberOfArray(array));
    }

    public static int minNumberOfArray(int[] arr) {
        int minNumber = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        return minNumber;
    }
}
