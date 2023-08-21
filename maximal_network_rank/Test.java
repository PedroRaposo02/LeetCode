package maximal_network_rank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {

        Map<Pair<Integer, int[][]>, Integer> testCases = new HashMap<>();

        testCases.put(Pair.of(4, new int[][] { { 0, 1 }, { 0, 3 }, { 1, 2 }, { 1, 3 } }), 4);
        testCases.put(Pair.of(5, new int[][] { { 0, 1 }, { 0, 3 }, { 1, 2 }, { 1, 3 }, { 2, 3 }, { 2, 4 } }), 5);
        testCases.put(Pair.of(8, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 2, 4 }, { 5, 6 }, { 5, 7 } }), 5);

        Solution s = new Solution();

        System.out.println("Running tests ...");

        testCases.forEach((input, expectedOutput) -> {
            int result = s.maximalNetworkRank(input.first(), input.second());

            if (result == expectedOutput) {
                System.out.println("\nTest case passed!");
            } else {
                System.out.println("\nTest case failed:");
                System.out.println("Input: ");
                System.out.println("n: " + input.first());
                System.out.println("Roads: ");
                Arrays.stream(input.second()).forEach(road -> System.out.println(Arrays.toString(road)));
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
