package org.problemsolving;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8};
        int missingNumber = findMissingNumber(array);
        System.out.println(missingNumber);

    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
