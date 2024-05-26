package com.datastructures.datastructures.leetcodeInJava.integers;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int n: nums) {
            result^=n;
        }
        return result;
    }

    //TC: O(n), SC: O(1)


    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,3};
        System.out.println(singleNumber(nums));
    }
}
