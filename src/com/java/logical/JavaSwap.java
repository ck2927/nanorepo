package com.java.logical;

public class JavaSwap {

    public static void main(String[] args) {
        int a = 10; int b = 20;
        System.out.println(" a :: "+a+", b :: "+b);
        String s = null;
        System.out.println(" a :: "+a+", b :: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a :: "+a+", b :: "+b);
        Runtime r = Runtime.getRuntime();
        System.out.println(r.maxMemory());
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());


    }
}
