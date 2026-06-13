package com.datastructures.datastructures.neetcode.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

//    sliding window + hash set / map problem.
    public int lengthOfLongestSubstring(String s) {
//        if(s.length() == 0) return 0;
//        int left = 0;
//        int right = 1;
//        int maxLength = 1;
//        Set<Character> set = new HashSet<>();
//        set.add(s.charAt(0));
//        while(right < s.length() && left < s.length()){
//            char rightString = s.charAt(right);
//            if(set.contains(rightString)){
//                set.remove(s.charAt(left));
//                left++;
//            } else {
//                set.add(rightString);
//                right++;
//                maxLength = Math.max(maxLength, right-left);
//            }
//        }
//        return maxLength;

        //Another optimized lines of code
        int left = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(s));
    }
}
