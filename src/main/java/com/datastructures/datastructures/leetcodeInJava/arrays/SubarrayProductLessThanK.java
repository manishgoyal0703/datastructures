package com.datastructures.datastructures.leetcodeInJava.arrays;

public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0; int product = 1; int left = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while(product >= k && left <= right){
                product /= nums[left];
                left++;
            }
            count += right - left + 1 ;
        }
        return count;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        SubarrayProductLessThanK productLessThanK = new SubarrayProductLessThanK();
        System.out.println(productLessThanK.numSubarrayProductLessThanK(nums,k));
    }
}
