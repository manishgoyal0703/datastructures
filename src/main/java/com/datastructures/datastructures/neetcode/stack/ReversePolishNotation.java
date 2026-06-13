package com.datastructures.datastructures.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;


public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Deque<Integer> deque= new ArrayDeque<>();
        for (String token: tokens) {
            if("+-/*".contains(token)){
                int b = deque.pop();
                int a = deque.pop();
                int result = 0;
                switch (token){
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    case "/":
                        result = a/b;
                        break;
                }
                deque.push(result);
            } else {
                deque.push(Integer.valueOf(token));
            }
        }
        return deque.peek();
    }

    public static void main(String[] args) {
        String[] tokens = new String[] {"1","2","+","3","*","4","-"};
        ReversePolishNotation notation = new ReversePolishNotation();
        System.out.println(notation.evalRPN(tokens));
    }
}
