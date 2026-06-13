package com.datastructures.datastructures.leetcodeInJava.bitManipulation;

public class SumOfTwoInteger {

    //TC: O(1), SC: O(1)
    public int getSum(int a, int b) {
        while(b != 0){
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }


    public static void main(String[] args) {
        SumOfTwoInteger sum = new SumOfTwoInteger();
        System.out.println(sum.getSum(5, 7));
    }
}
