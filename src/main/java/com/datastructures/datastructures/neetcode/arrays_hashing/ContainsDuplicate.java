package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num: nums) {
            numSet.add(num);
        }

        if(nums.length > numSet.size()) return true;
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int num[] = {1,2,3,3,4,4};
        System.out.println(cd.hasDuplicate(num));
    }
}
