package org.arrays.singel;

import java.util.Arrays;

public class DuplicateValue {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 3, 5};


    }
    public static boolean isDuplicate(int [] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i+1]) {
                return true;
            }
        }
        return false;
    }
}
