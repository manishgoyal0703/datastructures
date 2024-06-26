package com.datastructures.datastructures.leetcodeInJava.twoPointers;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int left = 0, right = 1;
        while (right < nums.length) {
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left+1;
    }
    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // 1,2,3,4,5,5,5,6,7,8,8,9
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }
}
