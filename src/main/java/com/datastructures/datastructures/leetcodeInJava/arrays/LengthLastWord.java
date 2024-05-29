package com.datastructures.datastructures.leetcodeInJava.arrays;

public class LengthLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if(s.charAt(i) == ' ') break;
            count++;
        }
        return count;
    }

    //TC: O(n), SC: O(1)


    public static void main(String[] args) {
        LengthLastWord word = new LengthLastWord();
        String s = "a";
        System.out.println(word.lengthOfLastWord(s));
    }
}
