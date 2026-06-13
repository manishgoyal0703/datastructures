package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right]!=0){
                nums[left] = nums[right];
                left++;
            }
        }
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

//    public void moveZeroes(int[] nums) {
//        int i=0, j=0;
//        while (i<nums.length){
//            if(nums[i]==0){
//                j=i+1;
//                while(j<nums.length && nums[j]==0) {
//                    j++;
//                }
//                if(j<nums.length){
//                    nums[i]= nums[j];
//                    nums[j] = 0;
//                }
//            }
//            i++;
//        }
//    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(arr);
        Arrays.stream(arr).forEach(e->System.out.print(e + " "));
    }
}
