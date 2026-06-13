package com.datastructures.datastructures.leetcodeInJava.famousAlgorithm;

public class BoyerMooreAlgorithm {

    public int majorityElement(int[] nums) {
//        int count = 1, me = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i] == me) count++;
//            else {
//                count--;
//                if(count < 0){
//                    me = nums[i];
//                    count = 1;
//                }
//            }
//        }
//        return me;

        int count =0;
        int majorityElement = 0;
        for(int num : nums){
            if(count == 0) {
                majorityElement = num;
            }
            if(majorityElement == num){
                count++;
            } else count--;
        }
        return majorityElement;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
      int[] nums = {2,2,1,1,1,2,2};
      BoyerMooreAlgorithm bm = new BoyerMooreAlgorithm();
        System.out.println(bm.majorityElement(nums));
    }
}
