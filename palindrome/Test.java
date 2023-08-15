package palindrome;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // test with errors if wrong
        Map<Integer, Boolean> testCases = new HashMap<>();
        testCases.put(121, true);
        testCases.put(-121, false);
        testCases.put(10, false);

        testCases.forEach((testCase, expected) -> {
            System.out.println("Test case: " + testCase);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + new Solution().isPalindrome(testCase));
            System.out.println();
        });
    }

}
