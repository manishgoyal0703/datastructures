package com.datastructures.datastructures.leetcodeInJava.famousAlgorithm;

public class KadensAlgorithm {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        KadensAlgorithm kadensAlgorithm = new KadensAlgorithm();
        int[] nums = {-2,-1,-3,4,-1,2,1,-5,4};
        System.out.println(kadensAlgorithm.maxSubArray(nums));
    }
}
