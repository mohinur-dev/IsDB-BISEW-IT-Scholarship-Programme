package org.arrays.singel;

public class Max {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 3};
        System.out.println("the max number is " + maxNumberOfArray(array));
    }

    public static int maxNumberOfArray(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }
}

