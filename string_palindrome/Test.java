package string_palindrome;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String testCase1 = "A man, a plan, a canal: Panama";
        String testCase2 = "race a car";
        String testCase3 = "0P";

        Map<String, Boolean> testCases = new HashMap<>();
        testCases.put(testCase1, true);
        testCases.put(testCase2, false);
        testCases.put(testCase3, false);

        Solution sol = new Solution();
        testCases.forEach((k, v) -> {
            boolean res = sol.isPalindrome(k);
            System.out.println("Test case: " + k + "\nResult: " + res + "\nExpected: " + v);
        });

    }
}
