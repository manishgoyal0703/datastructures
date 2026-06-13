package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;

        Set<Integer> arrSet = new HashSet<>();
        for (int num : nums) {
            arrSet.add(num);
        }

        int maxSequence = 1;
        for (int num: nums) {
            if(!arrSet.contains(num-1)){
                int currentSeq = 1;
                int currentNum = num;
                while(arrSet.contains(currentNum+1)){
                    currentNum++;
                    currentSeq++;
                }
                maxSequence = Math.max(maxSequence, currentSeq);
            }
        }
        return maxSequence;
    }

    public static void main(String[] args) {
        LongestConsecutive lc = new LongestConsecutive();
        int[] arr = {2,20,4,10,3,4,5};
        System.out.println(lc.longestConsecutive(arr));
    }
}
