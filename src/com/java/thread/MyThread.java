package com.java.thread;

public class MyThread extends Thread{

   /* public void start(){
        System.out.println("start method...");
    }*/
    @Override
   public void run(){
        String tname = Thread.currentThread().getName();
        System.out.println(" run tname :: "+tname);
        if(tname.equals("chandan"))
        {
            System.out.println("techmahindra employee .. he is able to get 10% discount");
        }

        // for(int i = 0; i< 5; i++)
        System.out.println("run.method..");
    }
}
