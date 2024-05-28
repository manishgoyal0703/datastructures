package com.datastructures.datastructures.leetcodeInJava.binarysearch;

public class MinInRotatedSortedArray {

    public int findMin(int[] nums) {
        int length = nums.length;
        if(length == 1) return nums[0];
        if(length == 2) return Math.min(nums[0], nums[1]);
        if(nums[0]< nums[length-1]) return nums[0];
        int low = 0;
        int high = length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] > nums[mid+1]) return nums[mid+1];
            if(nums[mid] < nums[mid-1]) return nums[mid];
            if(nums[mid] > nums[low])  low = mid+1;
            else high = mid-1;
        }
        return 0;
        // 7,8,0,1,2,3,4,5,6
    }

    //TC: O(log n), SC: O(1)

    public static void main(String[] args) {
        MinInRotatedSortedArray array = new MinInRotatedSortedArray();
        int[] nums = {7,8,1,2,3,4,5,6};
        System.out.println(array.findMin(nums));

    }
}
