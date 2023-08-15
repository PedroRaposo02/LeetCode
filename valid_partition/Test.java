package valid_partition;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<int[], Boolean> testCases = new HashMap<>();

        testCases.put(new int[] { 1, 2, 3, 4 }, false);
        testCases.put(new int[] { 4, 4, 4, 5, 6 }, true);
        testCases.put(new int[] { 1, 1, 1, 2 }, false);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            boolean result = s.validPartition(i);
            if (result != o) {
                System.out.println("\nTest failed!");
                System.out.println("Input: " + i);
                System.out.println("Expected: " + o);
                System.out.println("Got: " + result);
                System.exit(1);
            }
            else {
                System.out.println("\nTest passed!");
            }
        });

    }
}
