package count_parenthesis;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Map<String, Boolean> testCases = new HashMap<>();

        testCases.put("()", true);
        testCases.put("()[]{}", true);
        testCases.put("(]", false);
        testCases.put("([)]", false);
        testCases.put("{[]}", true);
    
        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            boolean result = s.isValid(input);
            if (result != output) {
                System.out.println("\nTest failed!");
                System.out.println("Input: " + input);
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
                System.exit(1);
            }
            else {
                System.out.println("\nTest passed!");
                System.out.println("Input: " + input);
                System.out.println("Output: " + result);
            }
        });
        
    }
}