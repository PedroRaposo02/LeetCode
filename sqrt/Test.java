package sqrt;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<Integer, Integer> testCases = new HashMap<>();
        
        testCases.put(0, 0);
        testCases.put(1, 1);
        testCases.put(2, 1);
        testCases.put(3, 1);
        testCases.put(4, 2);
        testCases.put(8, 2);
        testCases.put(9, 3);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            int result = s.mySqrt(input);

            if (result == output) {
                System.out.println("Test case passed!");
            } else {
                System.out.println("Test case failed:");
                System.out.println("Input: " + input);
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
