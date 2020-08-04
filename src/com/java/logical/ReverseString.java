package com.java.logical;

public class ReverseString {
    public static void main(String[] args) {
        // reverse string
        String s1 = "chandan"; String s2 = "kumar";

        StringBuffer s3 = new StringBuffer(s1);
        System.out.println(s3.append(s2));
        System.out.println(s3.reverse());
        // without stirngbuffer
        System.out.println(" s1 "+s1);
        int len = s1.length();
        char [] ch = s1.toCharArray();
        for(Character c : ch){
            System.out.println(c);
        }


        char [] temp = new char[ch.length];
        int j = 0;
        System.out.println(" ch "+ch.length);
        for(int i = ch.length-1 ; i >= 0; i--){
            temp[j] = ch[i];// 7 0, 6 1,5 2, 4 3, 3 4 , 2 5, 1 6, 0 7
            // System.out.println(j);
            j++;

        }
        System.out.println("temp :: "+temp.length);
        for(char ca : temp) {
            System.out.print(ca);
        }


    }
}
