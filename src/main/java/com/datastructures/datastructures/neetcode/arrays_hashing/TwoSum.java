package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            diffMap.put(nums[i],i);
        }
        for (int i = 0; i < len; i++) {
            int diff = target-nums[i];
            if(diffMap.containsKey(diff) && diffMap.get(diff) != i){
                return new int[]{i,diffMap.get(diff)};
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int nums[] = {3,4,6,9};
        int[] result = twoSum.twoSum(nums, 7);
        Arrays.stream(result).forEach(i->System.out.print(i + " "));
    }
}
