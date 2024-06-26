package com.datastructures.datastructures.leetcodeInJava.matrix;

import java.util.Arrays;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int row = 0; row < rowLen; row++) {
            if (matrix[row][0]==0){
                firstRowHasZero = true;
                break;
            }
        }

        for (int col = 0; col < colLen; col++) {
            if (matrix[0][col]==0){
                firstColHasZero = true;
                break;
            }
        }

        for (int row = 1; row < rowLen; row++) {
            for (int col = 1; col < colLen; col++) {
                if (matrix[row][col]==0){
                    matrix[0][col]=0;
                    matrix[row][0]=0;
                }
            }
        }

        for (int row = 1; row < rowLen; row++) {
            for (int col = 1; col < colLen; col++) {
                if (matrix[0][col]==0 || matrix[row][0]==0){
                    matrix[row][col]=0;
                }
            }
        }

        if (firstRowHasZero){
            for (int row = 0; row < rowLen; row++) {
                matrix[row][0]=0;
            }
        }

        if (firstColHasZero){
            for (int col = 0; col < colLen; col++) {
                matrix[0][col]=0;
            }
        }
        //TC: O(m*n), SC: O(1)


        //Brute force approach
//        int row = matrix.length;
//        int column = matrix[0].length;
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for(int i=0; i<row; i++){
//            for(int j=0; j<column; j++){
//                if(matrix[i][j]==0){
//                    list1.add(i);
//                    list2.add(j);
//                }
//            }
//        }
//
//        for(int line=0; line< list1.size(); line++){
//            int rowEntry = list1.get(line);
//            int rowColumn = list2.get(line);
//            for(int i=0; i<column; i++){
//                matrix[rowEntry][i]=0;
//            }
//            for(int j=0; j<row; j++){
//                matrix[j][rowColumn] = 0;
//            }
//        }
//    }
        //TC: O(m*n), SC: O(m*n)

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  0,  8,  9,  10},
                {11, 12, 13, 0,  15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        SetMatrixZeroes matrixZeroes = new SetMatrixZeroes();
        matrixZeroes.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
