package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Set<String> uniqueSet = new HashSet<>();
        int len = board.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                char ch = board[i][j];
                if(ch != '.'){
                    String row = "Rows: " + i + "value: " + ch;
                    String column = "Column: " + j + "value: " + ch;
                    String box = "BoxSet: " + i/3 + "-" + j/3 + "value: " + ch;
                    if(!(uniqueSet.contains(row) || uniqueSet.contains(column) || uniqueSet.contains(box))){
                        //For unique Rows
                        uniqueSet.add(row);
                        //For unique Columns
                        uniqueSet.add(column);
                        //For unique box
                        uniqueSet.add(box);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] validBoard = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        char[][] invalidBoard = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','1','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validSudoku.isValidSudoku(validBoard));
        System.out.println(validSudoku.isValidSudoku(invalidBoard));
    }
}
