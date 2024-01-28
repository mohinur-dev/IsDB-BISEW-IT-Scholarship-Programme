package org.arrays;

import java.util.HashSet;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        int missingElementByMethodeOne = findMissingElementOne(array);
        System.out.println("The missing element is: " + missingElementByMethodeOne);
        int missingElementByMethodeTwo = findMissingElementTwo(array);
        System.out.println("The missing element is: " + missingElementByMethodeTwo);
    }

    static int findMissingElementOne(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
    static int findMissingElementTwo(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int min = 1;
        int max = arr.length + 1;

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}

