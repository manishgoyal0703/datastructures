package com.datastructures.datastructures.leetcodeInJava.trie_heap;

import java.util.PriorityQueue;

public class LargestElementInArray {


    //TC: O(k + (n-k)(log(k)))  SC: O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for(int i=0; i< k; i++){
            minHeap.add(nums[i]);
        }
        for(int i=k; i< nums.length; i++){
            if(minHeap.peek() < nums[i]){
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        return minHeap.peek();
    }

    //TC: O(), SC: O()
    public static void main(String[] args) {
        LargestElementInArray heap = new LargestElementInArray();
        int[] arr = {1,2,3,58,9};
        System.out.println(heap.findKthLargest(arr, 2));

    }
}
