package com.datastructures.datastructures.leetcodeInJava.integers;

public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int result = 0;
        while(n>0){
            result += n/5;
            n = n/5;
        }
        return result;
//        int count =0;
//        int currentPowerOfFive = 5;
//        while(n>= currentPowerOfFive){
//            count += n/currentPowerOfFive;
//            currentPowerOfFive *=5;
//        }
//            return count;


    }

    //TC: O(log base5 n), SC: O(1)

    public static void main(String[] args) {
        System.out.println(trailingZeroes(125));
    }
}
