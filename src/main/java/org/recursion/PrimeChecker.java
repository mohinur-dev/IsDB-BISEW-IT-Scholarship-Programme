package org.recursion;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime ");
        Scanner sc = new Scanner(System.in);
        int inpNum = sc.nextInt();

        if (isPrime(inpNum, 2)) {
            System.out.println(inpNum + " is a prime number.");
        } else {
            System.out.println(inpNum + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num, int div) {
        if (num <= 2) {
            return num == 2;
        }
        if (num % div == 0) {
            return false;
        }
        if (div * div > num) {
            return true;
        }
        return isPrime(num, div + 1);
    }
}
