package com.datastructures.datastructures.leetcodeInJava.integers;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x<0) return false; //(x is negative)
        if(x!=0 && x%10==0) return false;  //( x is zero or ends with zero)
        int rem,rev=0;
        while(x>rev){
            rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
        }
        if((rev==x) || (x== rev/10)){
            return true;
        }
        return false;
    }

    //TC: O(log n), SC: O(1)

    public static void main(String[] args) {
        System.out.println(isPalindrome(138731));
    }
}
