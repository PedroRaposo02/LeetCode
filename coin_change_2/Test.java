package coin_change_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Utils.Pair;

public class Test {
    public static void main(String[] args) {

        Map<Pair<Integer, int[]>, Integer> map = new HashMap<>();
        
        map.put(Pair.of(5, new int[] { 1, 2, 5 }), 4);
        map.put(Pair.of(3, new int[] { 2 }), 0);
        map.put(Pair.of(10, new int[] { 10 }), 1);

        Solution s = new Solution();

        System.out.println("Running tests...");

        map.forEach((i, o) -> {
            int result = s.changeBottomUp(i.first(), i.second());
            if (result != o) {
                System.out.println("Test failed");
                System.out.println("Input 1: " + i.first());
                System.out.println("Input 2: " + Arrays.toString(i.second()));
                System.out.println("Output: " + result);
                System.out.println("Expected: " + o);
                System.exit(1);
            }
            else {
                System.out.println("Test passed");
            }
        });

    }
}
