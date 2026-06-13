package com.datastructures.datastructures.leetcodeInJava.strings;

import java.util.HashMap;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int left =0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if(!map.containsKey(ch)) {
                map.put(ch, right);
            } else {
                left = Math.max(left, map.get(ch)+1);
                map.put(ch, right);
            }
            ans = Math.max(ans, right - left +1);
        }
        return ans;
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
