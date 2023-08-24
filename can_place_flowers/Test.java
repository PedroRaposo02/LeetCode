package can_place_flowers;

import java.util.HashMap;
import java.util.Map;

import Utils.ArrayUtils;
import Utils.Pair;

public class Test {
    public static void main(String[] args) {
        Map<Pair<int[], Integer>, Boolean> testCases = new HashMap<>();

        testCases.put(new Pair<>(new int[] { 1, 0, 0, 0, 1 }, 1), true);
        testCases.put(new Pair<>(new int[] { 1, 0, 0, 0, 1 }, 2), false);
        testCases.put(new Pair<>(new int[] { 0, 0, 1, 0, 1 }, 1), true);
        testCases.put(new Pair<>(new int[] { 1, 0, 0, 0, 0, 1 }, 2), false);
        testCases.put(new Pair<>(new int[] { 1, 0, 0, 0, 1, 0, 0 }, 2), true);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            boolean result = s.canPlaceFlowers(input.getFirstPrivate(), input.getSecondPrivate());

            if (result == output) {
                System.out.println("Test passed!");
            } else {
                System.out.println("Test failed!");
                System.out.println("Input: ");
                ArrayUtils.printArray(input.getFirstPrivate());
                System.out.println("n: " + input.getSecondPrivate());
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
