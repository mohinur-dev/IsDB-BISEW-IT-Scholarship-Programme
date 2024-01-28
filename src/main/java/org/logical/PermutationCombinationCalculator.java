package org.logical;

import java.util.Scanner;

public class PermutationCombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of items (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of items to be arranged or selected (r): ");
        int r = scanner.nextInt();

        // Calculate and display permutations
        long permutationResult = calculatePermutation(n, r);
        System.out.println("Permutations (P(" + n + ", " + r + ")): " + permutationResult);

        // Calculate and display combinations
        long combinationResult = calculateCombination(n, r);
        System.out.println("Combinations (C(" + n + ", " + r + ")): " + combinationResult);

        scanner.close();
    }

    public static long calculatePermutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static long calculateCombination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}

