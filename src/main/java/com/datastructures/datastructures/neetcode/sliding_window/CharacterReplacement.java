package com.datastructures.datastructures.neetcode.sliding_window;

public class CharacterReplacement {

    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        int[] freq = new int[26]; // frequency of each character
        int maxFreq = 0;         // max frequency in current window

        for (int right = 0; right < s.length(); right++) {

            // Step 1: include right character
            int idx = s.charAt(right)-'A';
            freq[idx]++;

            //Step 2 : update max frequency
            maxFreq = Math.max(maxFreq, freq[idx]);

            // Step 3: shrink window if invalid
            while((right - left + 1) - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            //Step 4 : check the maxLen so far in the current window(update answer)
            maxLen = Math.max(maxLen, right - left +1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "ABBB"; int k = 2;
        CharacterReplacement characterReplacement = new CharacterReplacement();
        System.out.println(characterReplacement.characterReplacement(s , k));
    }
}
