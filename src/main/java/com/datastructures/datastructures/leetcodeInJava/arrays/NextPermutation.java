package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {

    }

    //TC: O(), SC: O()

    public static void main(String[] args) {
        NextPermutation permutation = new NextPermutation();
        int[] nums = {1,2,3};
        permutation.nextPermutation(nums);
        Arrays.stream(nums).forEach(e-> System.out.print(e + " "));
    }
}
