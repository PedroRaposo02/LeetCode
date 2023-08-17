package zero_one_matrix;

import java.util.HashMap;
import java.util.Map;

import Utils.ArrayUtils;

public class Test {
    public static void main(String[] args) {
        Map<int[][], int[][]> testCases = new HashMap<>();

        testCases.put(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } },
                new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } });

        testCases.put(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } },
                new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 2, 1 } });

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            int[][] result = s.updateMatrix(i);

            if (!ArrayUtils.equals(result, o)) {
                System.out.println("Test failed");
                System.out.println("Input: ");
                ArrayUtils.printArray(i);
                System.out.println("Expected: ");
                ArrayUtils.printArray(o);
                System.out.println("Actual: ");
                ArrayUtils.printArray(result);
                System.exit(1);
            } else {
                System.out.println("Test passed");
            }
        });
    }
}
