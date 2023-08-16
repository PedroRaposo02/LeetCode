package sliding_window_maximum;

import java.util.HashMap;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {
        Map<Pair<int[], Integer>, int[]> testCases = new HashMap<>();

        testCases.put(new Pair<>(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3),
                new int[] { 3, 3, 5, 5, 6, 7 });
        testCases.put(new Pair<>(new int[] { -7,-8,7,5,7,1,6,0 }, 4),
                new int[] { 7, 7, 7, 7, 7 });
                

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            int[] result = s.maxSlidingWindow(i.getKey(), i.getValue());

            if (!java.util.Arrays.equals(result, o)) {
                System.out.println("Test failed");
                System.out.println("Input: ");
                Utils.ArrayUtils.printArray(i.getKey());
                System.out.println("Expected: ");
                Utils.ArrayUtils.printArray(o);
                System.out.println("Actual: ");
                Utils.ArrayUtils.printArray(result);
                System.exit(1);
            } else {
                System.out.println("Test passed");
            }
        });
    }
}
