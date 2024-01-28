package org.arrays;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        A object = new A();
        object.start();
    }
}

class B implements Runnable {
    @Override
    public void run() {
        System.out.println("B");
    }
}

class A extends Thread {
    public void run () {
        System.out.println("A");
        Thread t = new Thread(new B());
        t.start();
    }
}