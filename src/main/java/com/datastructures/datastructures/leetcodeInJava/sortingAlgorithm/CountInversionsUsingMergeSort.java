package com.datastructures.datastructures.leetcodeInJava.sortingAlgorithm;

import java.util.Arrays;

public class CountInversionsUsingMergeSort {

    public long merge(int[] nums, int left, int mid, int right){
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
        long count =0;
        while(i<n1 && j<n2){
            if(A[i] > B[j]){
                nums[k++] = B[j++];
//                count += mid - (left+i)+1;
//                or
                count += n1 -i;
            }else {
                nums[k++] = A[i++];
            }
        }
        while(i<n1) {
            nums[k++] = A[i++];
        }
        while(j<n2){
            nums[k++] = B[j++];
        }
        return count;
    }

    public long sort(int[] nums, int left , int right){
        long count =0;
        if(left < right){
            int mid = left + (right-left)/2;
            count += sort(nums, left, mid);
            count += sort(nums, mid+1, right);
            count += merge(nums, left, mid, right);
        }
        return count;
    }

    //TC: O(n log n), SC: O(n)

    public static void main(String[] args) {
        CountInversionsUsingMergeSort mergeSort = new CountInversionsUsingMergeSort();
        int[] nums = {5, 3, 2, 4, 1};
        int left = 0;
        int right = nums.length-1;
        long count = mergeSort.sort(nums, left, right);
        Arrays.stream(nums).forEach(e-> System.out.print(e + " "));
        System.out.println();
        System.out.println(count);
    }
}
