package com.datastructures.datastructures.neetcode.twopointers;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

public class ContainsMostWater {


//    Two Pointer + Greedy Shrinking Window
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;
        while(left<right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;

            maxArea = Math.max(maxArea, height*width);

            if(heights[left] < heights[right])  left++;
            else right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,7,2,5,4,7,3,6};
        ContainsMostWater containsMostWater = new ContainsMostWater();
        System.out.println(containsMostWater.maxArea(height));
    }
}
