package com.datastructures.datastructures.educative.p1_twopointers;

public class S01_ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;

        while(left < right){

            while((left < right) && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while((left < right) && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "race a car";
        String s1 = "abcba";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
    }
}
