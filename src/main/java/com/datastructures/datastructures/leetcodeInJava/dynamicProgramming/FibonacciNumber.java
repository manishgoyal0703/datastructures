package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

public class FibonacciNumber {

    public int fib(int n) {
        if(n<=1) return n;
        int first = 0, second = 1, temp = 0;

        for (int i = 2; i <=n; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }

        return temp;
    }

    //TC: O(n), SC: O(1)
    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.fib(1));
    }
}
