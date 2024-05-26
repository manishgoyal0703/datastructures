package com.datastructures.datastructures.leetcodeInJava.integers;

public class PowXN {

    public static double myPow(double num, int n) {

        long pow = Math.abs((long)n);
        double result = 1.0;
        while(pow!=0){
            if(pow%2==1){
                result = result * num;
                pow = pow-1;
            }
            num *=num;
            pow = pow/2;
        }
        return n < 0 ? 1.0/result : result;
//        return Math.pow(x,n);
    }

    //TC: O(log n), SC: O(1)

    public static void main(String[] args) {
//        System.out.println(myPow(2.00000, -2));
        System.out.println(myPow(2.00000, 11));
    }
}
