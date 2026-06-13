package com.datastructures.datastructures.leetcodeInJava.stacksAndQueues;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i <= heights.length; i++) {
            int curr = (i == heights.length) ? -1 : heights[i];
            while (!st.isEmpty() && curr <= heights[st.peek()]){
                int height = heights[st.pop()];
                int width = (st.isEmpty()) ? i : i - st.peek() -1;
                int currArea = height * width;
                maxArea = Math.max(maxArea, currArea);
            }
            st.push(i);
        }
        return maxArea;
    }

    //TC: O(n), SC: O(n)

    public static void main(String[] args) {
        LargestRectangleInHistogram histogram = new LargestRectangleInHistogram();
        int[] heights = {2,1,5,6,2,3};
        System.out.println(histogram.largestRectangleArea(heights));
    }
}
