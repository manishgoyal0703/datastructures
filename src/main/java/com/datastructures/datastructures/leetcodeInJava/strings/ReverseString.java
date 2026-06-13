package com.datastructures.datastructures.leetcodeInJava.strings;

public class ReverseString {

    public static void reverseString(char[] s) {
        int length = s.length-1;
        for (int i = 0; i <=length/2; i++) {
            char temp = s[i];
            s[i] = s[length-i];
            s[length-i] = temp;
        }
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);

    }
}
