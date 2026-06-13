package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -1*nums[index];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]>0){
               result.add(i+1);
           }
        }

        return result;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        FindDisappearedNumbers numbers = new FindDisappearedNumbers();
        List<Integer> list = numbers.findDisappearedNumbers(nums);
        list.stream().forEach(e-> System.out.print(e + " "));
    }
}
