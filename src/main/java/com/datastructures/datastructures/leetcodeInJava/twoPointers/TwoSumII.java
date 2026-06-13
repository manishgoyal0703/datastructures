package com.datastructures.datastructures.leetcodeInJava.twoPointers;

import java.util.Arrays;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        int right = 1;
//        for (int left = 0; left < numbers.length; left++) {
//            int diff = target - numbers[left];
//            right = left + 1;
//            while(right < numbers.length && numbers[right] <= diff){
//                right++;
//            }
//            if(numbers[right-1] == diff){
//                result[0] = left+1;
//                result[1] = right;
//                break;
//            }
//        }
//        return result;

        int left = 0, right = numbers.length-1;
        while (left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target) break;
            else if (sum > target) right--;
            else left++;
        }
        return new int[]{left+1, right+1};
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
//        int[] numbers = {12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997};
        int target = 9;
        int[] numbers = {2,7,11,15};
        TwoSumII sum = new TwoSumII();
        Arrays.stream(sum.twoSum(numbers, target)).forEach(e-> System.out.println(e + " "));
    }
}
