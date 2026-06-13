package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroCount++;
            } else {
                oneCount++;
            }
            int diff = zeroCount - oneCount;
            if(map.containsKey(diff)){
                max = Math.max(max, i - map.get(diff));
            } else {
                map.put(diff, i);
            }
        }
        return max;
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        int[] nums = {0,0,1,0,0,0,1,1};
        ContiguousArray contiguousArray = new ContiguousArray();
        System.out.println(contiguousArray.findMaxLength(nums));
    }
}
