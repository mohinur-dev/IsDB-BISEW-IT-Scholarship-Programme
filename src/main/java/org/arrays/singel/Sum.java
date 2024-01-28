package org.arrays.singel;

public class Sum {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 3};
        System.out.println(sumOfArray(array));
    }
    public static int sumOfArray (int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
