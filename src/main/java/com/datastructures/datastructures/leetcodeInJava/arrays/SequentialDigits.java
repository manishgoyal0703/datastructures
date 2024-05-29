package com.datastructures.datastructures.leetcodeInJava.arrays;

import java.util.Collections;
import java.util.List;

public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {

        return Collections.EMPTY_LIST;
    }

    //TC: O(), SC: O()

    public static void main(String[] args) {
        int low = 100, high = 300;
        SequentialDigits digits = new SequentialDigits();
        List<Integer> list = digits.sequentialDigits(low,high);
        list.stream().forEach(e-> System.out.print(e + " "));
    }
}
