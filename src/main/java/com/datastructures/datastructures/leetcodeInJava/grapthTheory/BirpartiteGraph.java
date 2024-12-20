package com.datastructures.datastructures.leetcodeInJava.grapthTheory;

import java.util.LinkedList;
import java.util.Queue;

public class BirpartiteGraph {


    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int[] colors = new int[v];
        for (int node = 0; node < v; node++) {
            if(colors[node] == 0){
              if(bfs(graph, colors, node) == false){
                  return false;
              }
            }
        }
        return true;
    }

    private boolean bfs(int[][] graph, int[] colors, int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        colors[node] = 1;   // colors: -1, 1
        while (!queue.isEmpty()){
            int curr = queue.poll();
            for (int adj : graph[curr]){
                if (colors[adj] == 0) {
                    colors[adj] = -1 * colors[curr];
                    queue.add(adj);
                } else if(colors[curr] == colors[adj]){
                    return false;
                }
            }
        }
        return true;
    }


    //TC: O(V + E), SC: O(V)
    public static void main(String[] args) {
        BirpartiteGraph birpartiteGraph = new BirpartiteGraph();
        int[][] graph = {
                {1, 3}, // Node 0 is connected to Node 1 and Node 3
                {0, 2}, // Node 1 is connected to Node 0 and Node 2
                {1, 3}, // Node 2 is connected to Node 1 and Node 3
                {0, 2}  // Node 3 is connected to Node 0 and Node 2
        };
        System.out.println(birpartiteGraph.isBipartite(graph));
    }
}
