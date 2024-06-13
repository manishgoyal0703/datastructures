package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        //Find the breaking point where number is decreasing
        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }

        //Find the next highest element in the SubArray(Right side) and swap
        if(i>=0){
            int j = nums.length-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }

        //Reverse the SubArray(Right side) to get the shortest element list
        reverse(nums,i+1, nums.length-1);

    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int i, int j){
        while(i<=j){
            swap(arr, i ,j);
            j--;
            i++;
        }
    }


    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        NextPermutation permutation = new NextPermutation();
        int[] nums = {3,2,1};
        permutation.nextPermutation(nums);
        Arrays.stream(nums).forEach(e-> System.out.print(e + " "));
    }
}
