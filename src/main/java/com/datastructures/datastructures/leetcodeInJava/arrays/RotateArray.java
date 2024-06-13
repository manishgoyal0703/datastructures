package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 2;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        Arrays.stream(nums).forEach(e->System.out.print(e + " "));
    }
}
