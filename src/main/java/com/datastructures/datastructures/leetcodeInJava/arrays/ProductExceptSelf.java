package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {


        return nums;
    }

    //TC: O(), SC: O()

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ProductExceptSelf product = new ProductExceptSelf();
        product.productExceptSelf(nums);
        Arrays.stream(nums).forEach(e-> System.out.print(e + " "));
    }
}
