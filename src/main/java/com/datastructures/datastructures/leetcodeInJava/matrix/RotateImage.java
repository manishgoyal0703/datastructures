package com.datastructures.datastructures.leetcodeInJava.matrix;

import java.util.Arrays;

public class RotateImage {

    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }

    private void transpose(int[][] matrix){
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverseRows(int[][] matrix){
        int len = matrix.length;
        for (int i = 0; i <len; i++) {
            for (int j = 0; j < len/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-j-1];
                matrix[i][len-j-1] = temp;
            }

        }
    }

    //TC: O(m*n), SC: O(1)
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
