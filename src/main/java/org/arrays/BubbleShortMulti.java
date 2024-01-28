package org.arrays;

public class BubbleShortMulti {
    public static void main(String[] args) {
        int[][] array = {
                {41, 22, 93, 54},
                {85, 46, 57, 98},
                {19, 90, 81, 62}
        };
        printMultiArray(array);
        System.out.println("After sorting");
        arraySorting(array);
    }

    public static void arraySorting (int [][] array) {
        for (int[] tempArray : array) {

            for (int j = 0; j < tempArray.length - 1; j++) {
                for (int k = 0; k < tempArray.length - 1; k++) {
                    if (tempArray[k] > tempArray[k + 1]) {
                        int temp = tempArray[k];
                        tempArray[k] = tempArray[k + 1];
                        tempArray[k + 1] = temp;
                    }
                }
            }
            for (int arr : tempArray) {
                System.out.print(arr + " ");
            }
            System.out.println(" ");
        }
    }
    public static void printMultiArray (int [][] array) {
        for (int[] arrayMal: array) {
            for (int arraySin: arrayMal) {
                System.out.print(arraySin + " ");
            }
            System.out.println(" ");
        }
    }
}
