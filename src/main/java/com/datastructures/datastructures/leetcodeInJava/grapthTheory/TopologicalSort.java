package com.datastructures.datastructures.leetcodeInJava.grapthTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

    //Kahn's Algorithm

    public int[] topologicalSort(int v, ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[v];
        int[] top_sort = new int[v];
        for (ArrayList<Integer> list : adj) {
            for (int node : list) {
                inDegree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i] == 0){
              queue.add(i);
            }
        }

        int index = 0;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.add(neighbor);
                }
            }
            top_sort[index] = curr;
            index++;
        }
        
        return top_sort;
    }



    //TC: O(V + E), SC: O(V)
    public static void main(String[] args) {
        TopologicalSort sort = new TopologicalSort();
        int v = 6;

        // Adjacency list representation of the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);
        int[] result = sort.topologicalSort(v, adj);
        Arrays.stream(result).forEach(e-> System.out.print(e + " "));
    }

}
