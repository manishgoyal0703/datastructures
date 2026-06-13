package com.datastructures.datastructures.educative.p1_twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S02_ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            int left = i+1, right = n-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while(left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum < 0) left ++;
                else if(currentSum > 0) right--;
                else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left]==nums[left+1]) left ++;
                    while(left < right  && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-3,-3,6,1,2,-3};
        System.out.println(threeSum(nums));

    }
}
