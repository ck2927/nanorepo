package com.java.string;

import java.util.HashMap;

public class StringUppLoer {

    public static void main(String[] args) {

        HashMap<String,String> sp = new HashMap<>(10);
        System.out.println(sp.size());
        sp.put("10","chandan");
        sp.put("101","rathava");
        sp.put("01","sunil");
        sp.put(null,"motka");
        System.out.println(sp);
        System.out.println(sp.get("10"));
        String s = "ChandanKumarBng";
        //System.out.println(convertLowerUpper(s));
    }
    private static String convertLowerUpper(String st) {
        StringBuffer sb = new StringBuffer(st);
        int ln = sb.length();
        // Conversion using predefined methods
        for (int i = 0; i < ln; i++) {
            Character c = sb.charAt(i);
            if (Character.isLowerCase(c))
                sb.replace(i, i+1,Character.toUpperCase(c)+"");
            else
                sb.replace(i, i+1, Character.toLowerCase(c) + "");
        }
        return sb.toString();
    }
}
