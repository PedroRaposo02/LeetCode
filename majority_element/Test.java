package majority_element;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<int[], Integer> testCases = new HashMap<>();

        testCases.put(new int[] { 3, 2, 3 }, 3);
        testCases.put(new int[] { 2, 2, 1, 1, 1, 2, 2 }, 2);
        testCases.put(new int[] { 1 }, 1);

        Solution solution = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            int result = solution.majorityElementHashMap(input);

            if (result == output) {
                System.out.println("Test passed!");
            } else {
                System.out.println("Test failed!");
                System.out.println("Input: " + input);
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
            }
        });

    }
}
