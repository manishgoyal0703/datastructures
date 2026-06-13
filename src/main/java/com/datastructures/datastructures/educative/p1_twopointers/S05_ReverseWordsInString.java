package com.datastructures.datastructures.educative.p1_twopointers;

public class S05_ReverseWordsInString {

    public static String reverseWords(String sentence) {
//        String trimString = sentence.trim();
//        String cleanedString = trimString.replaceAll("\\s+", " ");
//        String[] arr = cleanedString.split(" ");
//        String result = "";
//        for (int i = arr.length-1; i >=0; i--) {
//            result += arr[i]+ " ";
//        }
//        return result.trim();

        String trimmed = sentence.trim();
        String[] resultArr = trimmed.split("\\s+");
        int left = 0, right = resultArr.length-1;
        while(left < right){
            String temp  = resultArr[right];
            resultArr[right] = resultArr[left];
            resultArr[left] = temp;
            left++; right--;
        }
        return String.join(" ", resultArr);
    }


    public static void main(String[] args) {
        String s = "  We love   Python  ";
        System.out.println(reverseWords(s));

    }
}
