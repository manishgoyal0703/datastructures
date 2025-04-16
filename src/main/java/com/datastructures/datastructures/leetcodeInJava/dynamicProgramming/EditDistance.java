package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

public class EditDistance {

    //insert - Left
    //delete - top
    //replace - diagonal

    //TC: O(m*n), SC: O(m*n)
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m==0) return n;
        if(n==0) return m;
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <=word1.length(); i++) {  //row
            dp[i][0] = i;
        }
        for (int i = 0; i <=word2.length(); i++) {   //column
            dp[0][i] = i;
        }
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                char c1 = word1.charAt(i-1);
                char c2 = word2.charAt(j-1);
                if(c1 == c2){
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int insert = dp[i][j-1];
                    int delete = dp[i-1][j];
                    int replace = dp[i-1][j-1];
                    dp[i][j] = 1+ Math.min(replace, Math.min(insert, delete));
                }
            }

        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        EditDistance editDistance = new EditDistance();
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(editDistance.minDistance(word1, word2));
    }
}
