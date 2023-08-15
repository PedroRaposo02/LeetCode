package unique_paths_2;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<int[][], Integer> testCases = new HashMap<>();

        testCases.put(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }, 2);
        testCases.put(new int[][] { { 0, 1 }, { 0, 0 } }, 1);

        Solution solution = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            int result = solution.uniquePathsWithObstacles(i);
            if (result != o) {
                System.out.println("Test failed");
                System.out.println("Input: " + i);
                System.out.println("Output: " + result);
                System.out.println("Expected: " + o);
                System.exit(1);
            }
            else {
                System.out.println("Test passed");
            }
        });
    }
}
