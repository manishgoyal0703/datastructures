package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str: strs) {
            int[] freq = new int[26];
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i)-'a']++;
            }
            String key = Arrays.toString(freq);
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String strs[] = new String[]{"act","pots","tops","cat","stop","hat"};

        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
}
