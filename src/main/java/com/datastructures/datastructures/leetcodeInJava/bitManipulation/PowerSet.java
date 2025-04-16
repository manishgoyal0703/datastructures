package com.datastructures.datastructures.leetcodeInJava.bitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {

    //TC: O(2^n * n) + (k log k), SC: O(2^n * n)
    private List<String> allPossibleStrings(String s){
        int n = s.length();
        List<String> powerSet = new ArrayList<>();
        int max = (1 << n) -1 ;
        for (int i = 1; i <=max; i++) {
            String str = "";
            for (int bit = 0; bit < n; bit++) {
                if((i & (1 << bit)) != 0){
                    str = s.charAt(n-1-bit) + str;
                }
            }
            powerSet.add(str);
        }
        Collections.sort(powerSet);
        return powerSet;
    }


    //TC: O(2^n * n), SC: O(2^n * n)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultSet = new ArrayList<>();
        int n = nums.length;
        int max = (1 << n) ;
        for (int i = 0; i < max; i++) {
            List<Integer> result = new ArrayList<>();
            for (int bit = 0; bit < n; bit++) {
                if((i & (1 << bit)) != 0){
                    result.add(nums[bit]);
                }
            }
            resultSet.add(result);
        }
        return resultSet;
    }


    public static void main(String[] args) {
        PowerSet set = new PowerSet();
        String s = "abc";
//        List<String> result = set.allPossibleStrings(s);
//        System.out.println(result);
        int[] nums = {1,2,3};
        List<List<Integer>> resultList = set.subsets(nums);
        System.out.println(resultList);
    }
}
