package org.recursion;

public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo.recursiveMethode(5);
    }
    public static void recursiveMethode(int n) {
        if (n < 1) {
            System.out.println("n is less than one");
        } else {
            recursiveMethode(n - 1);
            System.out.println(n);
        }
    }
}
