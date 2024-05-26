package com.datastructures.datastructures.leetcodeInJava.integers;

public class ReverseInteger {

    public static int reverse(int x) {
        int rem, rev =0;
        int num =x;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(num!=0){
            rem = num%10;
            if(rev > max/10) return 0;
            if(rev < min/10) return 0;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(rev<max || rev> min){
            return rev;
        }
        return 0;


//        long rem, rev =0;
//        long num =x;
//        if(num>0){
//            while(num>0){
//                rem = num%10;
//                rev = rev*10 + rem;
//                num = num/10;
//            }
//        } else {
//            num = -num;
//            while(num>0){
//                rem = num%10;
//                rev = rev*10 + rem;
//                num = num/10;
//            }
//            rev = -rev;
//        }
//        if(rev>2147483647 || rev<-2147483648){
//            return 0;
//        }
//        return (int)rev;


    }

    //TC: O(log |x|), SC: O(1)


    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
