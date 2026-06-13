package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

public class UniquePath {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if(r == 0 || c == 0) {
                    dp[r][c] = 1;
                } else {
                    dp[r][c] = dp[r-1][c] + dp[r][c-1];
                }
            }
        }

        return dp[m-1][n-1];
    }


    //TC: O(m*n), SC: O(m+n)
    public static void main(String[] args) {
        UniquePath path = new UniquePath();
        System.out.println(path.uniquePaths(3, 7));
    }
}
