package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        int minLength = String.valueOf(low).length();
        int maxLength = String.valueOf(high).length();
        List<Integer> result = new ArrayList<>();
        while(minLength<=maxLength){
            for (int i = 0; i <=s.length()-minLength; i++) {
                int value = Integer.valueOf(s.substring(i, i+minLength));
                if(value >=low && value <=high){
                    result.add(value);
                } else if (value > high) {
                    break;
                }
            }
            minLength++;
        }

        return result;
    }

    //TC: O(d.k) or O(1), SC: O(n)

    public static void main(String[] args) {
        int low = 234, high = 2314;
        SequentialDigits digits = new SequentialDigits();
        List<Integer> list = digits.sequentialDigits(low,high);
        list.stream().forEach(e-> System.out.print(e + " "));
    }
}
