package com.datastructures.datastructures.leetcodeInJava.grapthTheory;

public class NumberOfIslands {


    public int numIslands(char[][] grid) {
        int count =0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(grid[r][c] == '1'){
                    count += 1;
                    dfs(grid, r, c);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int r, int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c] = '0';
        //down, up, right, left
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }



    // BFS: use the Queue,  DFS: use the Stack

    //TC: O(m*n + m*n) -> O(m*n), SC: O(1)
    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numberOfIslands.numIslands(grid));

    }
}
