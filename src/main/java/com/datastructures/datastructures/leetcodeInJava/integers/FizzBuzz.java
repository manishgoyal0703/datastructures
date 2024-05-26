package com.datastructures.datastructures.leetcodeInJava.integers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if(i%15==0){
                result.add("FizzBuzz");
            } else if (i%5==0) {
                result.add("Buzz");
            } else if (i%3==0) {
                result.add("Fizz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    //TC: O(n), SC: O(n)



    public static void main(String[] args) {
        System.out.println(fizzBuzz(20));
    }
}
