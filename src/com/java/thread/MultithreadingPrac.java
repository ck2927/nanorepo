package com.java.thread;

public class MultithreadingPrac {

    public static void main(String[] args) {
        //System.out.println("welcome...");
        MyThread th =  null;//new MyThread();
        //th.start();
        //th.start();// we can't restart same therd, we willface RE - Exception in thread "main" java.lang.IllegalThreadStateException
        for(int i=0;i<5;i++){
            System.out.println(" Thread start...");
            th = new MyThread();

            Thread.currentThread().setName("chandan");
           System.out.println(" th name :: "+Thread.currentThread().getName());
            th.start();
        }
        //th.run(); //it will work as normal method
        System.out.println("Main Thread End...");

    }
}
