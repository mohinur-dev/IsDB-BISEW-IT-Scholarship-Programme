package org.logical;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        int min, max;
        boolean isPrime = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter minimum number");
        min = sc.nextInt();

        System.out.println("Enter maximum number");
        max = sc.nextInt();

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
