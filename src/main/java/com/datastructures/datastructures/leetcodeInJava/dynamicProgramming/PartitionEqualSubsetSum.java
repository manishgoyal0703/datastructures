package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

import java.util.Arrays;

public class PartitionEqualSubsetSum {


    // 0 - false , 1- true
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 == 1) return false;
        int target = sum/2;

        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int curr = dp.length-1; curr >= 0; curr--) {
                if(curr >= nums[i]){
                    dp[curr] = dp[curr] || dp[curr - nums[i]];
                }
            }
        }
        return dp[target];
    }


    //TC: O(n * target), SC: O(target)
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5, 9};
        PartitionEqualSubsetSum sum = new PartitionEqualSubsetSum();
        System.out.println(sum.canPartition(nums));
    }
}
