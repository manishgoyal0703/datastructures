package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        if(nums.length == set.size()) return false;
//        return true;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,4};
        System.out.println(duplicate.containsDuplicate(nums));
    }
}
