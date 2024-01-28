package org.class1;

public class Loop {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 900; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
                count ++;
            }
        }
        System.out.println(count);
    }
}
