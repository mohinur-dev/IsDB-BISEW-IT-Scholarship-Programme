package org.arrays.singel;

public class Average {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 3};
        System.out.println("Average of this array is " + averageOfArray(array));
    }

    public static double averageOfArray(int[] arr) {
        double length = arr.length;
        double sum = 0.0d;
        for (int i : arr) {
            sum += i;
        }
        return sum / length;
    }
}