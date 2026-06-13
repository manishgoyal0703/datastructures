package com.datastructures.datastructures.neetcode.stack;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
                continue;
            } else {
                if(stack.isEmpty()) return false;
                char pop = stack.pop();
                if(!((ch =='}' && pop == '{') || (ch ==']' && pop == '[') || (ch ==')' && pop == '('))) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid("([{}])"));
    }
}
