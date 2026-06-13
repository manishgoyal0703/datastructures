package com.datastructures.datastructures.leetcodeInJava.sortingAlgorithm;

import java.util.Arrays;

public class KthLargestUsingQuickSort {

    public int kthLargest(int[] nums, int k){
        return quickSort(nums, 0, nums.length-1, nums.length - k); //For Largest
//        return quickSort(nums, 0, nums.length-1, k-1); //For Smallest

    }

    private int quickSort(int[] nums, int low, int high, int k){
            int pivot = partition(nums, low, high);
            if(pivot == k){
                return nums[pivot];
            } else if (k > pivot){
                return quickSort(nums,pivot+1, high, k);
            } else {
                return quickSort(nums, low, pivot-1, k);
            }
    }

    private int partition(int[] nums, int low, int high){
        int i = low - 1;
        int pivot = nums[high];
        for (int j = low; j < high; j++) {
            if(pivot > nums[j]){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, high);
        return i+1;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    //TC: For most of the cases O(n), worst case: O(n log n), SC: O(log n)
    public static void main(String[] args) {
        int[] nums = {3,8,7,9,5,4,2,5};
        KthLargestUsingQuickSort quickSort = new KthLargestUsingQuickSort();
        int n = nums.length;
        int largest = 3;
        int result = quickSort.kthLargest(nums, largest);
        System.out.println(largest + " Largest element is: " + result);
        Arrays.stream(nums).forEach(e-> System.out.print(e + " "));

    }
}
