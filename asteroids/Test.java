package asteroids;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<int[], int[]> testCases = new HashMap<>();

        testCases.put(new int[] { 5, 10, -5 }, new int[] { 5, 10 });
        testCases.put(new int[] { 8, -8 }, new int[] {});
        testCases.put(new int[] { 10, 2, -5 }, new int[] { 10 });
        testCases.put(new int[] { -2, -1, 1, 2 }, new int[] { -2, -1, 1, 2 });
        testCases.put(new int[] { -2, -2, 1, -2 }, new int[] { -2, -2, -2 });

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            int[] result = s.asteroidCollision(Arrays.copyOf(input, input.length));
            if (result.length != output.length) {
                System.out.println("\nTest failed!");
                System.out.println("Input: ");
                Utils.ArrayUtils.printArray(input);
                System.out.println("Expected output: ");
                Utils.ArrayUtils.printArray(output);
                System.out.println("Actual output: ");
                Utils.ArrayUtils.printArray(result);
                // System.exit(1);
            } else {
                for (int i = 0; i < result.length; i++) {
                    if (result[i] != output[i]) {
                        System.out.println("\nTest failed!");
                        System.out.println("Input: ");
                        Utils.ArrayUtils.printArray(input);
                        System.out.println("Expected output: ");
                        Utils.ArrayUtils.printArray(output);
                        System.out.println("Actual output: ");
                        Utils.ArrayUtils.printArray(result);
                        System.exit(1);
                    }
                }
                System.out.println("\nTest passed!");
                System.out.println("Input: ");
                Utils.ArrayUtils.printArray(input);
                System.out.println("Output: ");
                Utils.ArrayUtils.printArray(result);
            }
        });
    }

    
}
