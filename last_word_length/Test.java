package last_word_length;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> testCases = new HashMap<>();

        testCases.put("Hello World", 5);
        testCases.put("   fly me   to   the moon  ", 4);
        testCases.put("luffy is still joyboy", 6);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            int result = s.lengthOfLastWord(i);

            if (result != o) {
                System.out.println("Test failed");
                System.out.println("Input: " + i);
                System.out.println("Expected: " + o);
                System.out.println("Actual: " + result);
                System.exit(1);
            } else {
                System.out.println("Test passed");
            }
        });
    }
}
