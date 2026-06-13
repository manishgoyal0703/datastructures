package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.Arrays;
import java.util.List;

public class ConcatenatedStrUniqueChar {

    public int maxLength(List<String> arr) {
        return helper(arr, "", 0);
    }

    public int helper(List<String> arr, String str, int currIndex) {
        if(currIndex == arr.size()) {
            return str.length();
        }
        int left = 0, right = 0;
        String temp = str + arr.get(currIndex);
        if(isUnique(temp)) {
            left = helper(arr, temp, currIndex + 1);
        }
        right = helper(arr, str, currIndex + 1);

        return Math.max(left, right);
    }

    public boolean isUnique(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>1) return false;
        }

        return true;
    }

    //TC: O(n*2^n), SC: O(n)
    public static void main(String[] args) {
        ConcatenatedStrUniqueChar uniqueChar = new ConcatenatedStrUniqueChar();
        List<String> list = Arrays.asList("un","iq","ue");
        System.out.println(uniqueChar.maxLength(list));
    }
}
