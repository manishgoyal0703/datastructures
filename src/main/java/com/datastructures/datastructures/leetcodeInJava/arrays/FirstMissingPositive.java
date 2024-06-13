package com.datastructures.datastructures.leetcodeInJava.arrays;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        //Process the Array
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=0){
                nums[i] = nums.length+1;
            }
        }
        //Marking indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(index< nums.length && nums[index]>0){
                nums[index] = -1*nums[index];
            }
        }
        //Scan the Array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        FirstMissingPositive positive = new FirstMissingPositive();
        int[] nums = {1,2,3,4};
        System.out.println(positive.firstMissingPositive(nums));
    }
}
