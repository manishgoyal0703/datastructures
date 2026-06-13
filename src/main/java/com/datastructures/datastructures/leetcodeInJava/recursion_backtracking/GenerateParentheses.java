package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public void helper(List<String> list, int size, String str, int open, int close){
        if(2*size == str.length()){
            list.add(str);
            return;
        }
        if(open<size){
            helper(list, size, str + "(", open+1 , close);
        }
        if(close<open){
            helper(list, size, str + ")", open, close+1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, n, "", 0, 0);
        return list;
    }

    //TC: O(4^n), SC: O(2n)
    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(3);
        System.out.println(result);

    }
}
