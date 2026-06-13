package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

public class LongestPalindromeSubsequence {


    //TC: O(2^n) -> (n^2), SC: O(n)
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        return dfs(s,0,n-1);
    }

    private int dfs(String s, int start, int end){
        if(start == end) return 1;
        if(start > end) return 0;
        if(s.charAt(start) == s.charAt(end)){
            return 2 + dfs(s, start+1, end-1);
        }
        int left = dfs(s, start+1, end);
        int right = dfs(s, start, end-1);
        return Math.max(left, right);
    }


    public static void main(String[] args) {
        LongestPalindromeSubsequence longestPalindromeSubsequence = new LongestPalindromeSubsequence();
        String s = "bbbab";
        System.out.println(longestPalindromeSubsequence.longestPalindromeSubseq(s));
    }
}
