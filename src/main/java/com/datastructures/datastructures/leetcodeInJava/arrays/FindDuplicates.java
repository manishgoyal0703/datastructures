package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Collections;
import java.util.List;

public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {

        return Collections.emptyList();
    }

    //TC: O(), SC: O()

    public static void main(String[] args) {
        FindDuplicates duplicates = new FindDuplicates();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = duplicates.findDuplicates(nums);
        list.stream().forEach(e-> System.out.print(e + " "));

    }
}
