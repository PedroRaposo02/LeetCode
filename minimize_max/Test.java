package minimize_max;

import java.util.HashMap;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {

        Map<Pair<int[], Integer>, Integer> testCases = new HashMap<>();

        testCases.put(Pair.of(new int[] { 10, 1, 2, 7, 1, 3 }, 2), 1);
        testCases.put(Pair.of(new int[] { 4, 2, 1, 2 }, 1), 0);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            int result = s.minimizeMax(i.getFirst(), i.getSecond());
            if (result != o) {
                System.out.println(String.format("FAIL: %s -> %d != %d", i, result, o));
            } else {
                System.out.println(String.format("PASS: %s -> %d", i, result));
            }
        });

    }
}
