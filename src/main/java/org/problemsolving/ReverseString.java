package org.problemsolving;

public class ReverseString {
    public static void main(String[] args) {
        String mainString  = "Hello World";
        System.out.println(mainString);
        String reverseString = reverseString2(mainString);
        System.out.println(reverseString);
    }

//    public static String reverseString(String str) {
//        char[] charArray = str.toCharArray();
//
//        for (int i = 0, j = charArray.length-1; i<j; i++, j--) {
//            char temp = charArray[i];
//            charArray[i] = charArray[j];
//            charArray[j] = temp;
//        }
//        return new String(charArray);
//    }

    public static String reverseString2 (String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
