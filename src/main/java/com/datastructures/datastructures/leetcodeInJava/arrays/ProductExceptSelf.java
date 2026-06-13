package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Arrays;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }
        int suffixProduct = 1;
        for (int i = nums.length-1; i >=0; i--) {
            prefixProduct[i] = prefixProduct[i] * suffixProduct;
            suffixProduct *= nums[i];
        }

        return prefixProduct;
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ProductExceptSelf product = new ProductExceptSelf();
        int[] result = product.productExceptSelf(nums);
        Arrays.stream(result).forEach(e-> System.out.print(e + " "));
    }
}
