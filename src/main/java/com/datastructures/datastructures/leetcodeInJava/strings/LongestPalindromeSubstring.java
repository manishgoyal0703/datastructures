package com.datastructures.datastructures.leetcodeInJava.strings;

public class LongestPalindromeSubstring {

    private int start =0;
    private int end =0;
    public String longestPalindrome(String s) {
        for(int i =0; i<s.length(); i++) {
            expandAroundCorner(s, i, i);
            expandAroundCorner(s, i, i+1);
        }
        return s.substring(start, end+1);
    }

    private void expandAroundCorner(String s, int left, int right) {
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        right--;
        if(end - start < right - left) {
            start = left;
            end = right;
        }
    }

    //TC: O(n2), SC: O(1)


    public static void main(String[] args) {
        LongestPalindromeSubstring palindromeSubstring = new LongestPalindromeSubstring();
        System.out.println(palindromeSubstring.longestPalindrome("babad"));
    }

}
