package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationNonDuplicates {

    private void findPermutation(String str, String perm, List<String> list){
        if(str.length() == 0) list.add(perm);
        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(0, i) + str.substring(i+1);
            findPermutation(temp, perm + str.charAt(i), list);
        }
    }


    //TC: O(n*n!), SC: O(n)
    public static void main(String[] args) {
        StringPermutationNonDuplicates permutation = new StringPermutationNonDuplicates();
        String str = "abc";
        List<String> list = new ArrayList<>();
        permutation.findPermutation(str, "", list);
        for (String s: list) {
            System.out.println(s);
        }
    }
}
