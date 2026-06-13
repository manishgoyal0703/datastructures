package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.util.Arrays;

public class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        result[0] = 1;
        for (int i = 1; i < len; i++) {
            result[i] = result[i-1]* nums[i-1];
        }

        int rightProduct = 1;
        for (int i = len-1; i >=0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductArrayExceptSelf productArray = new ProductArrayExceptSelf();
        int[] arr = new int[]{1,2,4,6};
        Arrays.stream(productArray.productExceptSelf(arr)).forEach(s -> System.out.print(s + " "));

    }
}
