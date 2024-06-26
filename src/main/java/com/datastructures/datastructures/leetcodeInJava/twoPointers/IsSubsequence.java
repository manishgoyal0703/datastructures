package com.datastructures.datastructures.leetcodeInJava.twoPointers;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int left = 0; int right = 0;
        while(right < t.length() && left < s.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++; right++;
            } else {
                right++;
            }
        }
        return left == s.length();
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence.isSubsequence(s,t));
    }
}
