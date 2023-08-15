package search_2d_matrix;

public class Solution {


    /*
     * You are given an m x n integer matrix matrix with the following two
     * properties:
     * 
     * Each row is sorted in non-decreasing order.
     * The first integer of each row is greater than the last integer of the
     * previous row.
     * Given an integer target, return true if target is in matrix or false
     * otherwise.
     * 
     * You must write a solution in O(log(m * n)) time complexity.
     */

    public boolean searchMatrix(int[][] matrix, int target) {

        int rowLength = matrix.length;
        int collumnLength = matrix[0].length;

        int rowIndex = -1;

        for (int i = 0; i < rowLength; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][collumnLength - 1]) {
                rowIndex = i;
                break;
            }
        }


        if (rowIndex < 0) {
            return false;
        }

        int start = 0;
        int end = collumnLength - 1;
        
        while(start <= end) {
            int mid = (end + start) / 2;
            int elem = matrix[rowIndex][mid];
            if (target == elem) {
                return true;
            }
            else if (target < elem) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return false;
    }
}
