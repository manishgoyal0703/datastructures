package com.datastructures.datastructures.leetcodeInJava.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseWords {

    public static String reverseWords(String s) {
//        String regex = "\\s{2,}";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(s);
//        String result = matcher.replaceAll(" ");
//        String[] filteredString = result.split(" ");
//        String finalResult = "";
//        for (int i = filteredString.length-1; i >=0; i--) {
//            finalResult = finalResult + " " + filteredString[i];
//        }
//        if(finalResult.charAt(finalResult.length()-1)==' ') finalResult = finalResult.substring(0,finalResult.length()-1);
//        return finalResult.substring(1);

        String [] array = s.trim().split("\\s+");
        int i=0, j = array.length-1;
        while(i<j){
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++; j--;
        }
        return String.join(" ", array);
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
