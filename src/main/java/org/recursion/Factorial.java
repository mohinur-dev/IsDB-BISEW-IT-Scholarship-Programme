package org.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to get factorial ");
        Scanner sc = new Scanner(System.in);
        int inpNum = sc.nextInt();
        System.out.println("The factorial of " +inpNum +" is " + factorialMethode(inpNum));
    }
    public static int factorialMethode (int n) {
        if(n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialMethode(n-1);
    }
}
