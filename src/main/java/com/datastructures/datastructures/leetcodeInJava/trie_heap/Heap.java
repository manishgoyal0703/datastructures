package com.datastructures.datastructures.leetcodeInJava.trie_heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {

    private void minHeap(){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(9);
        minHeap.add(12);
        minHeap.add(8);
        minHeap.add(15);
        System.out.println(minHeap);
    }

    private void maxHeap(){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(9);
        maxHeap.add(12);
        maxHeap.add(8);
        maxHeap.add(15);
        System.out.println(maxHeap);
    }



    //Heap Concepts
    // Heap can be stored in an array.
    // The root element is at index 0.
    // for Left child : (2*i)+1
    // for right child : (2*i)+2
    // for parent child : (i-1)/2

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.minHeap();
        heap.maxHeap();

    }


}
