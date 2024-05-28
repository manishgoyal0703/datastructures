package com.datastructures.datastructures.leetcodeInJava.binarysearch;

public class BinarySearch {
//    private int low =0;
//    private int high = 0;
//    private int mid = 0;

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }



//    public int search(int[] nums, int target) {
//        if(nums.length ==0) return -1;
//        high = nums.length-1;
//        return findIndex(nums,target);
//    }
//
//    private int findIndex(int[] nums, int target){
//        mid = (low+high)/2;
//        while(low<=high){
//            if(nums[mid] == target){
//                return mid;
//            } else if(nums[mid] < target){
//                low = mid+1;
//                findIndex(nums, target);
//            } else if(nums[mid] > target){
//                high = mid-1;
//                findIndex(nums, target);
//            }
//        }
//        if(low>=high && nums[mid] ==target) return mid;
//        return -1;
//    }

    //TC: O(log n), SC: O(1)

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(search.search(nums, target));
    }
}
