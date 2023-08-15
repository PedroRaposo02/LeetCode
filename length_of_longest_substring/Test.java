package length_of_longest_substring;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> testCases = new HashMap<>();
        
        testCases.put("abcabcbb", 3);
        testCases.put("bbbbb", 1);
        testCases.put("pwwkew", 3);
        testCases.put("", 0);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, expectedOutput) -> {
            int output = s.lengthOfLongestSubstring(input);
            if (output != expectedOutput) {
                System.out.println("\nTest failed!");
                System.out.println("Input: " + input);
                System.out.println("Expected output: " + expectedOutput);
                System.out.println("Actual output: " + output);
                System.exit(1);
            }
            else {
                System.out.println("\nTest passed!");
                System.out.println("Input: " + input);
                System.out.println("Output: " + output);
            }
        });
    }
}
