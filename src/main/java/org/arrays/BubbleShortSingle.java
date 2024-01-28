package org.arrays;

public class BubbleShortSingle {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 4, 9, 1};
        System.out.println("Before sorting");
        printArray(array);

        System.out.println("After sorting");
        sortingArray (array);
    }
    public static void sortingArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
        printArray(array);
    }
    public static void printArray(int [] array) {
        for(int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
