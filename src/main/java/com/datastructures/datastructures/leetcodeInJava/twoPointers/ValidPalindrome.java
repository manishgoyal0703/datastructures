package com.datastructures.datastructures.leetcodeInJava.twoPointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<=right){
            if(!Character.isLetterOrDigit(s.charAt(left))) left++;
            else if(!Character.isLetterOrDigit(s.charAt(right))) right--;
            else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                break;
            }
            else {
                left++;
                right--;
            }
        }
        return left >= right;
    }


    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(s));

    }
}
