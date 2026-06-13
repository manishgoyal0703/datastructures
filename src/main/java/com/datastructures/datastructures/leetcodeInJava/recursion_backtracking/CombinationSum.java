package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), candidates, target, 0, 0);
        return list;
    }

    public void helper(List<List<Integer>> list, List<Integer> comb, int[] candidates,
                       int target, int sum, int start){
        if(target == sum) {
            list.add(new ArrayList<>(comb));
            return;
        }
        else if(sum > target){
            return;
        }
        else{
            // To find all permutations instead of combinations then use i=0 instead of start.
            for(int i=start; i<candidates.length; i++){
                comb.add(candidates[i]);
                helper(list, comb, candidates, target,sum + candidates[i], i);
                comb.remove(comb.size()-1);
            }
        }

    }


    //TC: O(2^T), SC: O(T)  T- target value
    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        CombinationSum sum = new CombinationSum();
        List<List<Integer>> result = sum.combinationSum(candidates,target);
        for (List<Integer> a: result) {
            System.out.println(a);
        }
    }

}
