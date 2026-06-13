package com.datastructures.datastructures.neetcode.binarysearch;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n -1;
        while(low<=high){
            int mid = low + (high - low)/2;

            int row = mid/n;
            int col = mid%n;
            int value = matrix[row][col];

            if(value < target){
                low = mid + 1;
            } else if (value > target){
                high = mid - 1;
            } else if (value == target){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        SearchMatrix searchMatrix = new SearchMatrix();
        int[][] arr = new int[][]{{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;
        System.out.println(searchMatrix.searchMatrix(arr, target));
    }
}
