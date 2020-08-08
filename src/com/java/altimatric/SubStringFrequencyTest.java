package com.java.altimatric;

import java.util.Arrays;
import java.util.HashMap;

public class SubStringFrequencyTest {

    public static void main(String[] args) {
        String s = "boy";

        String [] s1 = {};

        char[] c = {};
        HashMap sp = new HashMap<>();
        for(int i=0; i < s.length() -1; i++){
            c[i] = s.charAt(i);
            System.out.println(" ");
        }



       // String resp =  new SubStringFrequencyTest().frequencyTest(s);
       // System.out.println(resp);

        int a =15;
        fixxBuzz(a);
    }

    private static void fixxBuzz(int x){

        /*String temp = Integer.toString(x);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        for(int i =0; i < temp.length(); i++)
        System.out.println(newGuess[i]);
        if(newGuess[i]))*/
        //int a = 123;


        for(int i = 1; i < x ; i ++){

            if(i%3 ==0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0 && i % 5 !=0){
                System.out.println("Fizz");
            }else if(i % 5 ==0 && i % 3 != 0 ){
                System.out.println("Buzz");
            }else
                System.out.println(i);
        }


    }

    private String frequencyTest(String s) {
        int n = s.length();
        int a = n*(n+1)/2;
        // set string size
        String[] arr = new String[a];
        // finding the substring of String
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int len = 1; len <= n - i; len++) {
                arr[index++] = s.substring(i, i + len);
            }
            System.out.println(" "+arr[i]);
        }
        // sort array'
        Arrays.sort(arr);


        // Concatenating all substrings
        String res = "";
        for (int i = 0; i < a; i++){
            res += arr[i];
            System.out.println("resp :: "+res);}
        return res;
    }


}
