package com.java.collection;

import sun.reflect.generics.tree.Tree;

import java.util.Calendar;
import java.util.TreeSet;

public class TreesetTest implements Runnable {
    private String threadName;
    private Thread t;

    public TreesetTest(String threadName) {
        this.threadName = threadName;
    }

    public static void main(String[] args) {

        /*TreeSet ts = new TreeSet();
        ts.add(new Customer(105,"chandan5",20005));
        ts.add(new Customer(102,"chandan2",20002));
        ts.add(new Customer(101,"chandan1",20001));
        ts.add(new Customer(104,"chandan4",20004));
        ts.add(new Customer(106,"chandan5",20006));
        System.out.println(ts);*/
        /*try{
            Calendar.getInstance();
            throw new Derived();
        } catch (Base b) {
            System.out.println(" caught base class exp");
        }*/
        /*try{
            System.out.println(doStuff(args));
        }catch(Exception e){
            System.out.println("exc");
            doStuff(args);
        }*/
        TreesetTest t1 = new TreesetTest("A");
        TreesetTest t2 = new TreesetTest("A");
        t2.start();
        t1.start();

    }
   /* static int doStuff(String[] args){
        return Integer.parseInt(args[0]);

    }*/

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(threadName);
        }
    }
}