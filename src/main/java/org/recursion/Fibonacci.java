package org.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number to get fibonacci series ");
        Scanner sc = new Scanner(System.in);
        int inpNum = sc.nextInt();

        for (int i = 0; i <= inpNum; i++) {
            System.out.println(fibonacciSeries(i));
        }
    }
    public static int fibonacciSeries(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
}
