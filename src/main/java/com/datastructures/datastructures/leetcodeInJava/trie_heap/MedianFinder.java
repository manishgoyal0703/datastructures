package com.datastructures.datastructures.leetcodeInJava.trie_heap;

import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
//        minHeap = new PriorityQueue<>((a,b)-> a-b);
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b)-> b-a);
    }

    //TC: O(log n), SC: O(log n)
    public void addNum(int num) {
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
        if(minHeap.size() < maxHeap.size()){
            minHeap.add(maxHeap.poll());
        }
    }

    //TC: O(1), SC: O(1)
    public double findMedian() {
        if(minHeap.size() == maxHeap.size()){
            return (minHeap.peek() + maxHeap.peek())/2.0;
        } else {
            return minHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();

        // Array of test numbers
        int[] testNumbers = {10, 20, 30, 40, 50, 60};

        // Add numbers one by one and print the current median
        System.out.println("Adding numbers to MedianFinder and finding the median:");

        for (int num : testNumbers) {
            medianFinder.addNum(num);
            double median = medianFinder.findMedian();
            System.out.println("Added " + num + ", current median: " + median);
        }
    }
}
