package com.datastructures.datastructures.leetcodeInJava.matrix;

public class RangeSumQuery {

    private int[][] matrix;


    public RangeSumQuery(int[][] matrix) {
        int[][] sumMatrix = new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                sumMatrix[i+1][j+1] = matrix[i][j] + sumMatrix[i+1][j] + sumMatrix[i][j+1] - sumMatrix[i][j];
            }
        }
        this.matrix = sumMatrix;
    }
    //TC: O(m*n), SC: O(m*n)

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrix[row2+1][col2+1] - matrix[row1][col2+1] - matrix[row2+1][col1] + matrix[row1][col1];
    }
    //TC: O(1), SC: O(1)



    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  0,  8,  9,  10},
                {11, 12, 13, 0,  15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        RangeSumQuery rangeSumQuery = new RangeSumQuery(matrix);
        int op = rangeSumQuery.sumRegion(1,1, 2, 3);
        System.out.println(op);
    }
}
