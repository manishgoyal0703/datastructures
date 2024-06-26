package com.datastructures.datastructures.leetcodeInJava.stacksAndQueues;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch: s.toCharArray()) {
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            } else{
                if(st.isEmpty()) return false;
                else {
                    char pop = st.pop();
                    if(!((pop == '{' && ch == '}') || (pop == '[' && ch == ']') || (pop == '(' && ch == ')')) ){
                        return false;
                    }
                }

            }
        }
        return st.isEmpty();
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        ValidParentheses parentheses = new ValidParentheses();
        String s = "]";
        System.out.println(parentheses.isValid(s));

    }
}
