package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int substract = target - nums[i];
            if(map.containsKey(substract)){
                return new int[]{map.get(substract), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        Arrays.stream(twoSum.twoSum(nums, target)).forEach(System.out::println);

    }
}