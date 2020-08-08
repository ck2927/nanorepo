package com.java.algo;

public class MaxArrayValue {
    public static void main(String[] args) {
        int [] a = {10,20,15,0,150};
       // System.out.println(max(a));
        int n = 1515;

        String s = Integer.toString(n);
        System.out.println("\""+n+"\"");
    }
   private static int max(int a[])
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=a[max])
                max=i;
        }
        return (a[max]);
    }
}
