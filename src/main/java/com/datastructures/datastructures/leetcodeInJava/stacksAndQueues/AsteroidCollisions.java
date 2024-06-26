package com.datastructures.datastructures.leetcodeInJava.stacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollisions {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int asteroid: asteroids) {
            if(asteroid > 0){
                st.push(asteroid);
            } else {
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(asteroid) > st.peek()){
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroid);
                } else if (st.peek() + asteroid == 0){
                    st.pop();
                }
            }

        }

        int[] result = new int[st.size()];
        for (int i = st.size()-1; i >=0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    //TC: O(n), SC: O(n)


    public static void main(String[] args) {
        AsteroidCollisions collisions = new AsteroidCollisions();
        int [] nums = {-2, -2, 1 , -2};
        int[] result = collisions.asteroidCollision(nums);
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));
    }
}
