package com.datastructures.datastructures.leetcodeInJava.twoPointers;

import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {
        int left =0, mid = 0, right = nums.length-1;
        while (mid<=right){
            if(nums[mid] == 0){
                swap(left, mid, nums);
                left ++; mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                swap(right, mid, nums);
                right--;
            }
        }
    }

    private void swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        sortColors.sortColors(nums);
        Arrays.stream(nums).forEach(e-> System.out.print(e+" "));

    }
}
