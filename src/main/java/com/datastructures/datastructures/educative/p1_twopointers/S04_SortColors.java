package com.datastructures.datastructures.educative.p1_twopointers;

import java.util.Arrays;

public class S04_SortColors {

    public static int[] sortColors (int[] colors) {
        int low = 0, mid = 0, high = colors.length-1;
        while(mid <= high){
            if(colors[mid] == 0){
               swap(low, mid, colors);
               low++;
               mid++;
            } else if (colors[mid] == 2){
                swap(mid, high, colors);
                high--;
            } else {
                mid++;
            }
        }
        return colors;
    }

    public static void swap(int p1, int p2, int[] colors){
        int temp = colors[p1];
        colors[p1] = colors[p2];
        colors[p2] = temp;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2,0,1,2,1,0,2,1,0,1};
//        sortColors(nums);
//        System.out.println(Arrays.toString(nums));

        int[] nums1 = new int[]{2,2,2,1,1,0,0,0};
        sortColors(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
