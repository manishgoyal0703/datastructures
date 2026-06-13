package com.datastructures.datastructures.neetcode.twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int p2 = s.length()-1;
        int p1 = 0;
        while (p2 >= p1){
            char f1 = s.charAt(p1);
            char l1 = s.charAt(p2);
            if(!Character.isLetterOrDigit(f1)){
                p1++;
                continue;
            } else if (!Character.isLetterOrDigit(l1)) {
                p2--;
                continue;
            } else if (Character.toLowerCase(f1) != Character.toLowerCase(l1)){
                return false;
            }
            p1++; p2--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println(palindrome.isPalindrome("Was it a car or a cat I saw?"));
    }
}
