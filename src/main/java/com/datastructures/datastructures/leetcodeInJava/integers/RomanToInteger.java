package com.datastructures.datastructures.leetcodeInJava.integers;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result =0;
        int n = s.length();
        for (int i=0; i<n; i++){
            int num = map.get(s.charAt(i));
            if(i<n-1 && num<map.get(s.charAt(i+1))){
                result-= num;
            } else {
                result+=num;
            }
        }
        return result;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
