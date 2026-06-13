package com.datastructures.datastructures.educative.p1_twopointers;

public class S06_ValidWordAbbreviation {

    public static boolean validWordAbbreviation(String word, String abbr) {
        return true;
    }


    public static void main(String[] args) {
        System.out.println(validWordAbbreviation("internationalization", "i12iz4n")); // true
        System.out.println(validWordAbbreviation("apple", "a2e"));                    // false
        System.out.println(validWordAbbreviation("substitution", "s10n"));            // true
        System.out.println(validWordAbbreviation("substitution", "s055n"));           // false (leading zero)
    }
}
