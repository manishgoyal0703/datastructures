package com.datastructures.datastructures.leetcodeInJava.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNA {

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < s.length()-9; i++) {
            String key = s.substring(i,i+10);
            if(resultMap.containsKey(key) && !result.contains(key)){
                result.add(key);
            } else {
                resultMap.put(key,1);
            }
        }
        return result;
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        List<String> output = findRepeatedDnaSequences("AAAAAAAAAAA");
        output.forEach(System.out::println);
    }
}
