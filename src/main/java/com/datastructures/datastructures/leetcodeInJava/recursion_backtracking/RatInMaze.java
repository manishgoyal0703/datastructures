package com.datastructures.datastructures.leetcodeInJava.recursion_backtracking;

import java.util.ArrayList;

public class RatInMaze {

    // TC: O(k*2^n) SC: O(n)
    private void solveMazeUtil(int[][] maze, boolean[][] visited, ArrayList<String> res,
                               int n, int r, int c, String currPath) {
        if(c<0 || c>=n || r<0 || r>=n || maze[r][c]==0 || visited[r][c]) return;
        if(r==n-1 && c==n-1) {
            res.add(currPath);
            return;
        }
        visited[r][c] = true;
        //down,up,left,right
        solveMazeUtil(maze, visited, res, n, r+1, c, currPath+"D");
        solveMazeUtil(maze, visited, res, n, r-1, c, currPath+"U");
        solveMazeUtil(maze, visited, res, n, r, c-1, currPath+"L");
        solveMazeUtil(maze, visited, res, n, r, c+1, currPath+"R");
        visited[r][c] = false;

    }

    private ArrayList<String> solveMaze(int maze[][], int n) {

        boolean[][] visited = new boolean[n][n];
        ArrayList<String> res = new ArrayList<>();
        solveMazeUtil(maze, visited, res, n, 0, 0, "");
        return res;

    }

//    TC: O(4^(n*n)), SC: O(n*n)
    public static void main(String[] args) {
        RatInMaze rat = new RatInMaze();
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        ArrayList<String> result = rat.solveMaze(maze, maze.length);
        System.out.println(result);

    }
}
