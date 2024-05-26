package com.datastructures.datastructures.leetcodeInJava.integers;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        for (int i = 0; i < 13; i++) {
            int value = storeInt[i];
            while (num>=value){
                result += storeRoman[i];
                num-=value;
            }
        }

        return result;
    }
    //TC: O(13 * log n), SC: O(13)

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

}
