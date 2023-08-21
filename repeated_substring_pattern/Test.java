package repeated_substring_pattern;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<String, Boolean> testCases = new HashMap<String, Boolean>();

        testCases.put("abab", true);
        testCases.put("aba", false);
        testCases.put("abcabcabcabc", true);
        testCases.put("ababab", true);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            boolean result = s.repeatedSubstringPattern(i);

            if(result == o) {
                System.out.println("Test passed!");
            }
            else {
                System.out.println("Test failed!");
                System.out.println("Input: " + i);
                System.out.println("Expected output: " + o);
                System.out.println("Actual output: " + result);
                System.exit(1);
            }
        });

    }
}
