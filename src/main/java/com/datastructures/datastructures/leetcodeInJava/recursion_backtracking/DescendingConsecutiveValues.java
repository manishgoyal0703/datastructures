package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.ArrayList;
import java.util.List;

public class DescendingConsecutiveValues {


    public boolean splitString(String s) {
        return helper(new ArrayList<>(), s, 0);
    }

    public boolean helper(List<Long> list, String str, int start){
        if(start == str.length()){
            return list.size() >=2;
        }
        long num =0;
        for(int i=start; i<str.length(); i++){
            num = num*10 + str.charAt(i) - '0';
            if(list.size()==0 || list.get(list.size()-1)-num == 1){
                list.add(num);
                if(helper(list, str,i+1)) return true;
                list.remove(list.size()-1);
            }
        }
        return false;
    }

    //TC: O(2^n), SC: O(n)
    public static void main(String[] args) {
        DescendingConsecutiveValues values = new DescendingConsecutiveValues();
        System.out.println(values.splitString("9080701"));
    }
}
