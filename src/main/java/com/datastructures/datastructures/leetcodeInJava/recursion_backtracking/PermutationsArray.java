package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsArray {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,list, new ArrayList<>());
        return list;
    }

    private void helper(int[] nums, List<List<Integer>> list , List<Integer> perm){
        if(perm.size() == nums.length){
            list.add(new ArrayList<>(perm));
        }
        for (int i = 0; i < nums.length; i++) {
            if(perm.contains(nums[i])) continue;
            perm.add(nums[i]);
            helper(nums, list, perm);
            perm.remove(perm.size()-1);
        }
    }


    //TC: O(n*log n ) + O(n*n!) -> n*n!, SC: O(n)
    public static void main(String[] args) {
        PermutationsArray array = new PermutationsArray();
        List<List<Integer>> list = array.permute(new int[]{1,2,3});
        for (List<Integer> l: list) {
            System.out.println(l);
        }

    }
}
