package search_2d_matrix;

import java.util.HashMap;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {

        Map<Pair<int[][], Integer>, Boolean> testCases = new HashMap<>();

        testCases.put(Pair.of(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3), true);
        testCases.put(Pair.of(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 13), false);
        testCases.put(Pair.of(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 23), true);
        testCases.put(Pair.of(new int[][] { { 1 } }, 1), true);
        testCases.put(Pair.of(new int[][] { { 1, 3 } }, 3), true);
        
        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            boolean result = s.searchMatrix(i.getKey(), i.getValue());

            if (result == o) {
                System.out.println("Test case passed!");
            } else {
                System.out.println("Test case failed:");
                System.out.println("Input: ");
                // print matrix
                for (int[] row : i.getKey()) {
                    for (int elem : row) {
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                }
                System.out.println("Target: " + i.getValue());
                System.out.println("Expected output: " + o);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
