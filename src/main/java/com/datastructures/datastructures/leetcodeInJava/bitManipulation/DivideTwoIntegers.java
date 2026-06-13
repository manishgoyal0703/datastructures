package com.datastructures.datastructures.leetcodeInJava.bitManipulation;

public class DivideTwoIntegers {

    //TC: O(1), SC: O(1)
    public int divide(int dividend, int divisor) {

        // Edge case: Overflow when result exceeds int range
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // to avoid overflow
        }

        // Determine sign of result using XOR
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to long to handle abs(Integer.MIN_VALUE)
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        // Shift divisor left until it just fits into dividend
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                result += 1 << i;     // Add 2^i to result
                a -= b << i;          // Subtract b * 2^i from a
            }
        }

        return isNegative ? -result : result;
    }


    public static void main(String[] args) {
        DivideTwoIntegers twoIntegers = new DivideTwoIntegers();
        System.out.println(twoIntegers.divide(10, 3));
    }
}
