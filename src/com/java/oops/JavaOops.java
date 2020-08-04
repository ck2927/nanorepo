package com.java.oops;

public class JavaOops {
    public String getName(){
        System.out.println("parents");
        return "parents";
    }
}

 class ChildOops {

     public static void main(String[] args) {
         System.out.println("childs");

         String s = "chandan";
         String s1 = s.substring(1,5); // 0,1,2,3,4,5,6,7,8,9..... (firstIndex , lastIndex - firstIndex)
         System.out.println(s1);
     }


}
