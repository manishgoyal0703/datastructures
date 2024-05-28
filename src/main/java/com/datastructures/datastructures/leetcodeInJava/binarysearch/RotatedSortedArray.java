package com.datastructures.datastructures.leetcodeInJava.binarysearch;

public class RotatedSortedArray {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]) high = mid-1;
                else low = mid+1;
            } else {
                if(target>=nums[mid] && target <= nums[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }

    //TC: O(log n), SC: O(1)


    public static void main(String[] args) {
        RotatedSortedArray array = new RotatedSortedArray();
        int[] nums = {7,8,1,2,3,4,5,6};
        int target = 1;
        System.out.println(array.search(nums, target));
    }
}
