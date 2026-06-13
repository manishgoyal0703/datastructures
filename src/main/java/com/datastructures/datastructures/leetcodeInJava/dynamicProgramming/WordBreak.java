package com.datastructures.datastructures.leetcodeInJava.dynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {


    //TC: O(n^3 + m), SC: O(n + m)
    // n -> length of s , m -> count of wordDict.
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0]= true;
        Set<String> set = new HashSet<>(wordDict);
        for (int i = 1; i <=s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String suffix = s.substring(j,i);
                if(set.contains(suffix) && dp[j] == true){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple","pen");
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak(s, wordDict));

    }
}
