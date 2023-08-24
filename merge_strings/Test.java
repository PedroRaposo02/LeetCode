package merge_strings;

import java.util.HashMap;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {
        Map<Pair<String, String>, String> testCases = new HashMap<>();

        testCases.put(new Pair<String, String>("abc", "pqr"), "apbqcr");
        testCases.put(new Pair<String, String>("ab", "pqrs"), "apbqrs");
        testCases.put(new Pair<String, String>("abcd", "pq"), "apbqcd");

        Solution s = new Solution();

        testCases.forEach((i, o) -> {
            String result = s.mergeAlternately(i.first(), i.second());
            if (result.equals(o)) {
                System.out.println("Test passed!");
            } else {
                System.out.println("Test failed!");
                System.out.println("Input: " + i.first() + ", " + i.second());
                System.out.println("Expected: " + o);
                System.out.println("Actual: " + result);
            }
        });
    }
}
