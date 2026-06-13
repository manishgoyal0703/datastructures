package com.datastructures.datastructures.neetcode.twopointers;

import java.util.Arrays;

public class TwoSumTwo {

    public int[] twoSum(int[] numbers, int target) {
        int p2 = numbers.length-1;
        int p1 = 0;
        while (p1 < p2) {
            int sum = numbers[p1]+numbers[p2];
            if(sum > target) p2--;
            else if (sum < target) p1++;
            else return new int[]{p1+1, p2+1};
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSumTwo sumTwo = new TwoSumTwo();
        int [] numbers = {1,2,3,4};
        int[] result = sumTwo.twoSum(numbers, 3);
        Arrays.stream(result).forEach(s-> System.out.print(s + " "));
    }
}
