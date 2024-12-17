package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhoneNum {

    private String[] phoneArray = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> comb = new ArrayList<>();
        if(digits.isEmpty()) return comb;
        helper(comb, digits, "");
        return comb;
    }

    private void helper(List<String> comb, String nextDigits, String str){
        if(nextDigits.isEmpty()){
            comb.add(str);
        } else {
            String phoneKeys = phoneArray[nextDigits.charAt(0)-'2'];
            for (Character ch: phoneKeys.toCharArray()) {
                helper(comb, nextDigits.substring(1), str + ch);
            }
        }
    }


    //TC: O(4^n), SC: O(n)
    public static void main(String[] args) {
        String input = "23";
        LetterCombinationsPhoneNum phoneNum = new LetterCombinationsPhoneNum();
        List<String> result = phoneNum.letterCombinations(input);
        System.out.println(result);
    }

}
