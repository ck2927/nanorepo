package com.java.coadility;

import java.util.*;
class CodilityTest {

    public static void main(String[] args) {
        int []A = {3, 1, 2};
        int []B = {4,6,3, 1, 2};
        int []C = {-1, -2};

        CodilityTest codilityTest = new CodilityTest();
        System.out.print( codilityTest.solution(A));
    }

    //to find the minimum integer number but that number should not match or available in array A.  A {value >1 < 0};
    public int solution(int[] A) {
        int[] b = A;
        int N = A.length;
        int i = 0;
        int resp = 0;
        //we can convert A into Arrays.asList(A) but all the integer not inserting in list
        // create a TreeList to get assending order sorted array
         Set set =  new TreeSet();
       // List set= Arrays.asList(b); //new TreeSet(); store object hash value
//        for(; i < N; i++){
//            set.add(A[i]);
//        }
        for(int a: A)set.add(a);

        System.out.println(" List of value in A :: "+set); // it will give sorted with assending order.
        //Collections.sort(new ArrayList(set));
       // System.out.println(" arrae List of value in A :: "+set);
        for(int j =1; j <= N + 1; j++){
            if(!set.contains(j)) {
                resp = j;
                break;
            }
        }
        return resp;
    }
}
