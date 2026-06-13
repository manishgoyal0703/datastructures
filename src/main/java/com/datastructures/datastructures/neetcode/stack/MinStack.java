package com.datastructures.datastructures.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    public Deque<Integer> stack;
    public Deque<Integer> minStack;
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }

    }

    public void pop() {
        int val = stack.pop();
        if(val == minStack.peek()) minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
       return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();

        st.push(5);
        System.out.println("Min: " + st.getMin()); // 5

        st.push(8);
        System.out.println("Top: " + st.top());    // 8
        System.out.println("Min: " + st.getMin()); // 5

        st.push(3);
        System.out.println("Min: " + st.getMin()); // 3

        st.push(2);
        System.out.println("Min: " + st.getMin()); // 2

        st.pop();
        System.out.println("After pop Min: " + st.getMin()); // 3

        st.pop();
        System.out.println("After pop Min: " + st.getMin()); // 5

        System.out.println("Top: " + st.top()); // 8
    }
}
