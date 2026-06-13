package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

public class LongestIncreasingSubsequence {


    //TC: O(n*n), SC: O(n)
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(nums.length ==1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int len = 0;
            for (int j = 0; j < i; j++) {
              if(nums[j] < nums[i]){
                len = Math.max(len,dp[j]);
              }
            }
            dp[i] = 1 + len;
            ans = Math.max(ans,dp[i]);
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
        System.out.println(subsequence.lengthOfLIS(nums));
    }
}
