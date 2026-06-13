package com.datastructures.datastructures.leetcodeInJava.strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: s.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }
        }
        for (Character c: t.toCharArray()) {
            if(!map.containsKey(c)){
               return false;
            } else{
                int value = map.get(c);
                if(value>1){
                    map.put(c,value-1);
                } else {
                    map.remove(c);
                }
            }
        }
        return map.isEmpty() ? true : false;
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        System.out.println(isAnagram("anaagram", "nagaram"));
    }
}
