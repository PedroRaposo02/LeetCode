package word_break;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {

        Map<Pair<String, List<String>>, Boolean> testCases = new HashMap<>();

        testCases.put(Pair.of("leetcode", List.of("leet", "code")), true);
        testCases.put(Pair.of("applepenapple", List.of("apple", "pen")), true);
        testCases.put(Pair.of("catsandog", List.of("cats", "dog", "sand", "and", "cat")), false);
        testCases.put(Pair.of("catsanddog", List.of("cats", "dog", "sand", "and", "cat")), true);

        Solution solution = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            boolean result = solution.wordBreak(input.getFirst(), input.getSecond());

            if (result == output) {
                System.out.println("\nTest passed!");
            } else {
                System.out.println("\nTest failed!");
                System.out.println("Input: " + input);
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
