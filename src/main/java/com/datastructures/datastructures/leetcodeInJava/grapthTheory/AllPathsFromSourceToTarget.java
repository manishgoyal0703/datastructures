package com.datastructures.datastructures.leetcodeInJava.grapthTheory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathsFromSourceToTarget {


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        int target = graph.length-1;
        bfs(graph, result, 0, target);
        return result;
    }

    private void bfs(int[][] graph, List<List<Integer>> result, int src, int target){
        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        path.add(src);
        queue.add(path);
        while(!queue.isEmpty()){
            path = queue.poll();
            int last = path.get(path.size()-1);
            if(last == target){
                result.add(path);
                continue;
            }

            for (int adj : graph[last]) {
                if(!path.contains(adj)){
                    List<Integer> newPath = new ArrayList<>(path);
                    newPath.add(adj);
                    queue.add(newPath);
                }
            }
        }

    }

    //TC: O(2^n * n), SC: O(2^n * n)
    public static void main(String[] args) {
        int[][] graph = {
                {4, 3, 1},
                {3, 2, 4},
                {3},
                {4},
                {}
        };
        AllPathsFromSourceToTarget target = new AllPathsFromSourceToTarget();
        List<List<Integer>> result = target.allPathsSourceTarget(graph);
        System.out.println(result);
    }
}
