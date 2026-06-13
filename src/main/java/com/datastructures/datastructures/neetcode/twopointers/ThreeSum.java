package com.datastructures.datastructures.neetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = len-1;
            int target = nums[i];
            while(left < right){
                int leftNum = nums[left];
                int rightNum = nums[right];
                int sumResult = leftNum + rightNum + target;
                if(sumResult == 0){
                    result.add(List.of(target, leftNum, rightNum));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                } else if (sumResult > 0) right--;
                else left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(nums);
        result.stream().forEach(e-> System.out.println(e));
    }
}
