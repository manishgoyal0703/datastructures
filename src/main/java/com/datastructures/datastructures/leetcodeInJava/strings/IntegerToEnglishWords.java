package com.datastructures.datastructures.leetcodeInJava.strings;

public class IntegerToEnglishWords {

    private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        return convert(num);
    }

    public String convert(int num){
        String result = new String();
        if(num<10) result = belowTen[num];
        else if(num<20) result = belowTwenty[num-10];
        else if(num<100) result = belowHundred[num/10] + " " +  convert(num%10);
        else if(num<1000) result = convert(num/100)  + " Hundred " + convert(num%100);
        else if(num<1000000) result = convert(num/1000)  + " Thousand " + convert(num%1000);
        else if(num<1000000000) result = convert(num/1000000)  + " Million " + convert(num%1000000);
        else result = convert(num/1000000000)  + " Billion " + convert(num%1000000000);
        return result.trim();
    }

    //TC: O(Log n), SC: O(Log n)


    public static void main(String[] args) {
        IntegerToEnglishWords words = new IntegerToEnglishWords();
        System.out.println(words.numberToWords(12345));
    }
}
