package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if(n==1){
                list.add(Arrays.asList(1));
                return list;
            }
            if(k==1){
                for (int a = 1; a <=n; a++) {
                    list.add(Arrays.asList(a));
                }
                return list;
            }
            int j = i+1;
            while(j<=n){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                for (int l = j; l < j+k-1; l++) {
                    temp.add(l);
                }
                list.add(temp);
                j++;
            }
        }
        return list;
    }



    //TC: O(), SC: O()
    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        List<List<Integer>> list = combinations.combine(3, 3);
        for (List<Integer> l: list) {
            System.out.println(l);
        }
    }

}
