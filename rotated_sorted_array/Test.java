package rotated_sorted_array;

import java.util.HashMap;
import java.util.Map;

import Utils.ArrayUtils;
import Utils.Pair;

public class Test {
    public static void main(String[] args) {

        Map<Pair<int[], Integer>, Integer> testCases = new HashMap<>();

        testCases.put(Pair.of(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0), 4);
        testCases.put(Pair.of(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3), -1);
        testCases.put(Pair.of(new int[] { 1 }, 0), -1);
        testCases.put(Pair.of(new int[] { 1, 3 }, 0), -1);
        testCases.put(Pair.of(new int[] {4,5,6,7,0,1,2}, 0), 4);
        testCases.put(Pair.of(new int[] { 3, 1 }, 1), 1);
        testCases.put(Pair.of(new int[] { 3, 4, 5, 6, 1, 2 }, 2), 5);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            int result = s.search(i.getKey(), i.getValue());

            if (result == o) {
                System.out.println("Test case passed!");
            } else {
                System.out.println("Test case failed:");
                System.out.println("Input: ");
                ArrayUtils.printArray(i.getKey());
                System.out.println();
                System.out.println("Target: " + i.getValue());
                System.out.println("Expected output: " + o);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
