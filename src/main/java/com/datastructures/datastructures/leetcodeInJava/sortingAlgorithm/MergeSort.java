package com.datastructures.datastructures.leetcodeInJava.sortingAlgorithm;

import java.util.Arrays;

public class MergeSort {

    public void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] A = new int[n1];
        int[] B = new int[n2];
        for (int i = 0; i < n1; i++) {
            A[i] = nums[left+i];
        }
        for (int i = 0; i < n2; i++) {
            B[i] = nums[mid + 1 + i];
        }
        int i =0, j =0, k = left;
        while(i<n1 && j<n2){
            if(A[i] <= B[j]){
                nums[k++] = A[i++];
            }else {
                nums[k++] = B[j++];
            }
        }
        while(i<n1) nums[k++] = A[i++];
        while(j<n2) nums[k++] = B[j++];
    }

    public void sort(int[] nums, int left , int right){
        if(left < right){
            int mid = left + (right-left)/2;
            sort(nums, left, mid);
            sort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }

    //TC: O(n log n), SC: O(n)
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] nums = {5, 2, 3, 1};
        int left = 0;
        int right = nums.length-1;
        mergeSort.sort(nums, left, right);
        Arrays.stream(nums).forEach(e-> System.out.print(e + " "));
    }
}
