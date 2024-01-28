package org.problemsolving;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");

        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

//    public static boolean isPalindrome(String s) {
//        s = s.toLowerCase();
//        s = s.replaceAll("[a-zA-Z0-9]", "");
//        int left = 0;
//        int right = s.length()-1;
//
//        while(left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left ++;
//            right --;
//        }
//        return true;
//    }

//    public static boolean isPalindrome(String str) {
//        String cleanString = str.toLowerCase().replaceAll("//s", "");
//        int length = cleanString.length();
//
//        for (int i = 0; i < length; i++) {
//            if (str.charAt(i) != str.charAt(length - 1 -i)) {
//                return false;
//            }
//        }
//            return true;
//    }

}
