package com.java.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        String tname = new Thread().getName();
        System.out.println(" tname :: "+tname);
        if(tname.equals("chandan"))
        {
            System.out.println("techmahindra employee .. he is able to get 10% discount");
        }

        System.out.println("run mehtod....");
    }

    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(new MyRunnable());
        t.setName("chandan");
        t.start();
        System.out.println("Main Thread..");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" annonimous run method...");
            }
        }).start();

        new Thread(() ->{
            System.out.println(" lambda expression ..run mehtod....");
        }).start();

    }
}
