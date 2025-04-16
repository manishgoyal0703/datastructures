package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

public class ClimbingStairs {


    //TC: O(n), SC: O(n) with the help of DP
    public int climbStairs(int n) {
        if(n<=2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    //TC: O(n), SC: O(1) without DP with constant space.
    public int climbStairs1(int n) {
        if(n<=1) return n;
        int first = 1, second = 1, temp = 0;

        for (int i = 2; i <=n; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }

        return temp;
    }







    public static void main(String[] args) {
        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs(5));
    }
}
