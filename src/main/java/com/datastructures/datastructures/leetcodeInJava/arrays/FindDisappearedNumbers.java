package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Collections;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        return Collections.emptyList();
    }

    //TC: O(), SC: O()

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        FindDisappearedNumbers numbers = new FindDisappearedNumbers();
        List<Integer> list = numbers.findDisappearedNumbers(nums);
        list.stream().forEach(e-> System.out.print(e + " "));
    }
}
