package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num: nums) {
            numsMap.put(num, numsMap.getOrDefault(num,0)+1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> map : numsMap.entrySet()) {
            if(k == 0){
                if(map.getValue() > 1) count++;
            } else {
                if(numsMap.containsKey(map.getKey()+k)) count++;
            }
        }
        return count;
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        FindPairs findPairs = new FindPairs();
        System.out.println(findPairs.findPairs(nums, k));
    }
}
