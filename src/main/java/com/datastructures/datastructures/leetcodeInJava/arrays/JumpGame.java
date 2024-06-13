package com.datastructures.datastructures.leetcodeInJava.arrays;

public class JumpGame {

    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length && i <= reachable; i++) {
            reachable = Math.max(reachable, i+nums[i]);
            if(reachable>= nums.length-1) return true;
        }
        return false;
    }

    //TC: O(n), SC: O(1)


    public static void main(String[] args) {
        int[] nums = {0};
        JumpGame game = new JumpGame();
        System.out.println(game.canJump(nums));
    }
}
