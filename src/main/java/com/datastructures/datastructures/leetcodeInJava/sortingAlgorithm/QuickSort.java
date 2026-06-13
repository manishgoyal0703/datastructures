package com.datastructures.datastructures.leetcodeInJava.sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {

    private void quickSort(int[] nums, int low, int high){
        if(low < high){
            int pivot = partition(nums, low, high);
            quickSort(nums, low, pivot-1);
            quickSort(nums, pivot+1, high);
        }
    }

    private int partition(int[] nums, int low, int high){
        int i = low-1;
        int pivot = nums[high];
        for (int j = low; j < high; j++) {
            if(pivot > nums[j]){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, high);
        return (i+1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



    //TC: O(n log n), SC: O(n)
    public static void main(String[] args) {
        int [] nums = {3,8,7,9,5,4,2,5};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums, 0, nums.length-1);
        Arrays.stream(nums).forEach(e-> System.out.print(e+ " "));

    }
}
