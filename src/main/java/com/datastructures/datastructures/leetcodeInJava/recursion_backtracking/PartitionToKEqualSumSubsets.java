package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.Arrays;

public class PartitionToKEqualSumSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum =0;
        for(int num: nums) {
            sum += num;
        }
        if(sum%k != 0) return false;
        int targetSum = sum/k;
        Arrays.sort(nums);
        return helper(nums, new boolean[nums.length], k, targetSum, 0, nums.length-1);
    }

    public boolean helper(int[] nums, boolean[] visited, int k, int targetSum, int currSum, int index) {
        if(k==0) return true;
        if(targetSum == currSum) {
            return helper(nums, visited, k-1, targetSum, 0, nums.length-1);
        }
        for (int i = index; i >=0; i--) {
            if(visited[i]) continue;
            if(i+1 < nums.length && nums[i] == nums[i+1] && !visited[i+1]) continue;
            if(currSum + nums[i] > targetSum) continue;
            visited[i] = true;
            if(helper(nums, visited, k, targetSum, currSum + nums[i], i-1)) return true;
            visited[i] = false;
        }

        return false;
    }

    // TC: O(k*2^n) SC: O(n)
    public static void main(String[] args) {
        PartitionToKEqualSumSubsets subsets = new PartitionToKEqualSumSubsets();
        int[] nums = new int[]{4,3,2,3,5,2,1};
        System.out.println(subsets.canPartitionKSubsets(nums, 4));
    }
}
