package climbing_stairs;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 5);
        map.put(5, 8);
        map.put(6, 13);
        map.put(7, 21);

        Solution solution = new Solution();

        System.out.println("Running tests...");

        map.forEach((input, output) -> {
            int result = solution.climbStairs(input);

            if (result == output) {
                System.out.println("Test passed!");
            } else {
                System.out.println("Test failed!");
                System.out.println("Input: " + input);
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
