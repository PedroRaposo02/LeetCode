package unique_paths_2;

public class Solution {
    /*
     * You are given an m x n integer array grid. There is a robot initially located
     * at the top-left corner (i.e., grid[0][0]). The robot tries to move to the
     * bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move
     * either down or right at any point in time.
     * 
     * An obstacle and space are marked as 1 or 0 respectively in grid. A path that
     * the robot takes cannot include any square that is an obstacle.
     * 
     * Return the number of possible unique paths that the robot can take to reach
     * the bottom-right corner.
     * 
     * The testcases are generated so that the answer will be less than or equal to
     * 2 * 10^9.
     */

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1)
            return 0;
        
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;

        int[] dp = new int[cols];

        for (int i = 0; i < cols; i++) {
            dp[i] = 0;
        }
        dp[0] = 1;


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (obstacleGrid[row][col] == 1) {
                    dp[col] = 0;
                } else {
                    if (col > 0) {
                        dp[col] += dp[col - 1];
                    }
                }
            }
        }
        
        return dp[cols - 1];
    }
}
