package com.datastructures.datastructures.neetcode.binarysearch;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] < target){
                low = mid+1;
            } else if (nums[mid] > target){
                high = mid-1;
            } else if (nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,2,4,6,8};
        int target = 3;
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(nums, target));
    }
}
