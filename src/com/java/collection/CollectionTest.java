package com.java.collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {

        Map m = new HashMap<String,String>();
        m.put("101","chandna");
        m.put("201","rahua");
        m.put("301","sang");
        m.put("101","ram");
        m.put("100","rada");
        m.put("10","rafdasfdsfdas");
        System.out.println(m.size()+", data :: "+m);

        /*Collections.sort(m, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {

                return 0;
            }
        });*/
        // by key sorting
        TreeMap tp = new TreeMap(m);
        System.out.println(m.size()+", tree data :: "+tp);
        // by value sorting

    }
    public void getLambdaExp(){

    }

}
