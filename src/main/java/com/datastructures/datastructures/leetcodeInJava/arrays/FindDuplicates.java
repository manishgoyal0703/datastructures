package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -1*nums[index];
            } else {
                result.add(Math.abs(nums[i]));
            }
        }
        return result;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        FindDuplicates duplicates = new FindDuplicates();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = duplicates.findDuplicates(nums);
        list.stream().forEach(e-> System.out.print(e + " "));

    }
}
