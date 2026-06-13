package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

public class MColoring {

    //TC: O(n * m^n), SC: O(n) + O(n)
    // m - color,  n - 1....n


    public boolean graphColoring(int graph[][], int m, int n){
        int[] color = new int[n];
        return helper(graph, color, m, 0);
    }

    public boolean helper(int[][] graph, int[] color, int m, int r){
        if(r == graph.length) return true;
        for (int i = 1; i <=m; i++) {
            if(isSafe(graph, color, i, r)){
                color[r] = i;
                if(helper(graph,color,m, r+1)) return true;
                color[r] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int[][] graph, int[] color, int currColor, int r){
        for (int c = 0; c < graph[0].length; c++) {
            if(graph[r][c] == 1){
                if(color[c] == currColor) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MColoring coloring = new MColoring();

        int graph[][] = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 1 },
                { 1, 0, 1, 0 },
        };
        int m = 3; // Number of colors
        System.out.println(coloring.graphColoring(graph, m, graph.length));
    }
}
