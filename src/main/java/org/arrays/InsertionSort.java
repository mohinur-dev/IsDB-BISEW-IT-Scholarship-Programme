package org.arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 3, 1};

        System.out.println("Before sorting:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nAfter sorting:");
        printArray(array);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Iterate through the array starting from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than the key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert the key into its correct position
            arr[j + 1] = key;
        }
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

