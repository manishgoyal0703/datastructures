package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {

    }

    //TC: O(), SC: O()

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        Arrays.stream(nums).forEach(e->System.out.print(e + " "));
    }
}
