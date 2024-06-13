package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithZeroSum {

    public int largestSubarrayWithZeroSum(int[] nums){
        int sum =0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum==0) max = i+1;
            else if(map.containsKey(sum)){
                max = Math.max(max, i-map.get(sum));
            } else {
                map.put(sum,i);
            }
        }
        return max;
    }

    //TC: O(n), SC: O(n)


    public static void main(String[] args) {
        LargestSubarrayWithZeroSum sum = new LargestSubarrayWithZeroSum();
        int[] nums = {-2,2,10,-8,1,7,10,25};
        System.out.println(sum.largestSubarrayWithZeroSum(nums));

    }
}
