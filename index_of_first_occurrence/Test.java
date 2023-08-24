package index_of_first_occurrence;

import java.util.HashMap;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {
        Map<Pair<String, String>, Integer> testCases = new HashMap<>();

        testCases.put(new Pair<>("hello", "ll"), 2);
        testCases.put(new Pair<>("aaaaa", "bba"), -1);
        testCases.put(new Pair<>("", ""), 0);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            int result = s.strStr(input.getFirstPrivate(), input.getSecondPrivate());

            if (result == output) {
                System.out.println("Test case passed!");
            } else {
                System.out.println("Test case failed:");
                System.out.println("Input: " + input.getFirstPrivate() + ", " + input.getSecondPrivate());
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
