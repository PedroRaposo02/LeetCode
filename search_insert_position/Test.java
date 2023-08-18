package search_insert_position;

import java.util.HashMap;
import java.util.Map;

import Utils.Pair;
import Utils.Timer;

public class Test {
    public static void main(String[] args) {
        Map<Pair<int[], Integer>, Integer> testCases = new HashMap<>();

        testCases.put(new Pair<>(new int[] { 1, 3, 5, 6 }, 7), 4);
        testCases.put(new Pair<>(new int[] { 1, 3, 5, 6 }, 5), 2);
        testCases.put(new Pair<>(new int[] { 1, 3, 5, 6 }, 2), 1);
        testCases.put(new Pair<>(new int[] { 1, 3 }, 2), 1);
        testCases.put(new Pair<>(new int[] { 1, 3, 5 }, 1), 0);

        Solution s = new Solution();

        System.out.println("Running tests...");

        // Timer t = new Timer();
        // t.start();
        testCases.forEach((i, o) -> {
            int result = s.searchInsert(i.getKey(), i.getValue());
            if (result != o) {
                System.out.println("Test failed");
                System.out.println("Input: ");
                Utils.ArrayUtils.printArray(i.getKey());
                System.out.println("Target: " + i.second());
                System.out.println("Expected: " + o);
                System.out.println("Actual: " + result);
                System.exit(1);
            } else {
                System.out.println("Test passed");
            }
        });
        // t.end();

        // System.out.println(t.getElapsedTime());
    }
}
