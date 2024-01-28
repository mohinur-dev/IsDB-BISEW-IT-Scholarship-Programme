package org.logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

//        System.out.println(reverseNumber(input));
        int reverse =reverseNumber(input);

        if (input == reverse) {
            System.out.println("its palindrome");
        } else {
            System.out.println("its not palindrome");
        }

    }

    public static int reverseNumber(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem; //if i don't multiply by 10 then i get sum of element
            num = num / 10;
        }
        return sum;
    }
}
