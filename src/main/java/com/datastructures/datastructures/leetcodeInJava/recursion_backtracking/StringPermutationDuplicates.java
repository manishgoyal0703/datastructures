package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.*;

public class StringPermutationDuplicates {

    private void findPermutation(String str, List<String> list){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        String sortedStr = new String(charArr);
        getPermutation(sortedStr, "", list);
    }

    private void getPermutation(String str, String perm, List<String> list){
        if(str.length() == 0) list.add(perm);
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                String temp = str.substring(0,i) + str.substring(i+1);
                getPermutation(temp, perm + ch, list);
            }
            set.add(ch);
        }
    }


    //TC: O(n*n!), SC: O(n)
    public static void main(String[] args) {
        StringPermutationDuplicates duplicates = new StringPermutationDuplicates();
        List<String> list = new ArrayList<>();
        duplicates.findPermutation("aba", list);
        for (String s: list) {
            System.out.println(s);
        }
    }
}
