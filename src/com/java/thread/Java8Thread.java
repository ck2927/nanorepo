package com.java.thread;

class Java8Thread extends Thread
{
    public void run()
    {
       // for(int i=0;i<5;i++)
       // {
            System.out.println(" .. "+Thread.currentThread().getPriority());
            System.out.println(" .. "+Thread.currentThread().getName());
            //Thread.yield(); // giving another thread same priority chance...
            System.out.println("child thread");
       // }
    }
}
class ThreadYieldDemo
{
    public static void main(String[] args)
    {
        Java8Thread t=new Java8Thread();
        Thread.currentThread().setPriority(10);
        Thread.currentThread().setName("chandan");
        t.start();
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("main thread");
//        }
    }
}

