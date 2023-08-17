package predict_winner;

import java.util.HashMap;
import java.util.Map;

import Utils.ArrayUtils;
import Utils.Timer;

public class Test {
    public static void main(String[] args) {
        Map<int[], Boolean> testCases = new HashMap<>();

        testCases.put(new int[] { 1, 5, 2 }, false);
        testCases.put(new int[] { 1, 5, 233, 7 }, true);
        testCases.put(new int[] { 1, 5, 2, 4, 6 }, true);

        Solution s = new Solution();

        System.out.println("Running tests...");
        Timer t = new Timer();
    
        /*
         * Time the no caching solution
         */
        t.start();
        testCases.forEach((i, o) -> {
            boolean result = s.predictTheWinner(i);

            if (result != o) {
                System.out.println("Test failed");
                System.out.println("Input: ");
                ArrayUtils.printArray(i);
                System.out.println("Expected: " + o);
                System.out.println("Actual: " + result);
                System.exit(1);
            } else {
                System.out.println("Test passed");
            }
        });
        t.end();
        System.out.println("No caching: " + t.getElapsedTime() + "ms");

        /*
         * Time the caching solution
         */

        t.start();
        testCases.forEach((i, o) -> {
            boolean result = s.predictTheWinner(i);

            if (result != o) {
                System.out.println("Test failed");
                System.out.println("Input: ");
                ArrayUtils.printArray(i);
                System.out.println("Expected: " + o);
                System.out.println("Actual: " + result);
                System.exit(1);
            } else {
                System.out.println("Test passed");
            }
        });
        t.end();
        System.out.println("Cached: " + t.getElapsedTime() + "ms");

    }
}
