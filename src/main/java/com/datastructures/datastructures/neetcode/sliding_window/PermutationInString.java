package com.datastructures.datastructures.neetcode.sliding_window;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];      // frequency of s1
        int[] freq2 = new int[26];       // frequency of current window in s2

        // Step 1: build frequency for s1
        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i)-'a';
            freq1[idx]++;
        }

        int left = 0;
        // Step 2: sliding window over s2
        for (int right = 0; right < s2.length(); right++) {
            int idx = s2.charAt(right)-'a';
            freq2[idx]++;

            // Step 3: maintain fixed window size
            if((right - left + 1) > s1.length()){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }

            // Step 4: compare frequencies
            if(Arrays.equals(freq1, freq2)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s1 = "abc", s2 = "lecabee";
        PermutationInString permutationInString = new PermutationInString();
        System.out.println(permutationInString.checkInclusion(s1, s2));
    }
}
