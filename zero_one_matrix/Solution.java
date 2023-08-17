package zero_one_matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[][] updateMatrix(int[][] mat) {

        if(mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0][0];
        }

        int m = mat.length;
        int n = mat[0].length;
        int maxValue = m * n;

        Queue<int[]> queue = new LinkedList<>();

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = 0;
                    queue.offer(new int[] { i, j });
                } else {
                    result[i][j] = maxValue;
                }
            }
        }

        int[][] directions = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            for(int[] dir : directions) {
                int x = current[0] + dir[0];
                int y = current[1] + dir[1];

                if(x < 0 || x >= m || y < 0 || y >= n || result[x][y] <= result[current[0]][current[1]] + 1) {
                    continue;
                }

                result[x][y] = result[current[0]][current[1]] + 1;
                queue.offer(new int[] {x, y});
            }
        }

        return result;
    }

}
