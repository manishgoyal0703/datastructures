package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
//        Map<Character, Integer> magazineMap = new HashMap<>();
//        for (char m: magazine.toCharArray()) {
//            magazineMap.put(m, magazineMap.getOrDefault(m,0)+1);
//        }
//        for (char r: ransomNote.toCharArray()) {
//            if(magazineMap.containsKey(r) && magazineMap.get(r)>0){
//                magazineMap.put(r,magazineMap.get(r)-1);
//            }
//            else return false;
//        }
//        return true;

        int[] frequency = new int[26];
        for (int i = 0; i < magazine.length(); i++)
            frequency[magazine.charAt(i) - 'a']++;

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if(frequency[c - 'a'] == 0) return false;
            frequency[c - 'a']--;
        }
        return true;
    }

    //TC: O(m + n), SC: O(C)

    public static void main(String[] args) {
        RansomNote note = new RansomNote();
        String ransomNote = "baa";
        String magazine = "aab";
        System.out.println(note.canConstruct(ransomNote, magazine));
    }
}
