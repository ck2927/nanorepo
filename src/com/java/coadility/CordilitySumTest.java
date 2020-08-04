package com.java.coadility;

public class CordilitySumTest {
    public static void main(String[] args) {
        int a = 16;//16 -79,19-199,7 - 7
        new CordilitySumTest().solution(a);
    }

    public int solution(int A){

        return sumOfAValue(A);
    }

    private int sumOfAValue(int a) {
        int sumresp = 0;
        int temp = 0;
        while(a != 0){
            //System.out.println(" a "+a);
            sumresp = sumresp + a%10;
            a = a/10;
        }
        System.out.println(" sumval "+sumresp);
        return sumresp;
    }

}
