package median_of_two_sorted_arrays;

import java.util.HashMap;
import java.util.Map;

import Utils.ArrayUtils;
import Utils.Pair;

public class Test {
    public static void main(String[] args) {
        Map<Pair<int[], int[]>, Double> testCases = new HashMap<Pair<int[], int[]>, Double>();

        testCases.put(new Pair<int[], int[]>(new int[] { 1, 3 }, new int[] { 2 }), 2.0);
        testCases.put(new Pair<int[], int[]>(new int[] { 1, 2 }, new int[] { 3, 4 }), 2.5);
        testCases.put(new Pair<int[], int[]>(new int[] { 0, 0 }, new int[] { 0, 0 }), 0.0);
        testCases.put(new Pair<int[], int[]>(new int[] {}, new int[] { 1 }), 1.0);

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((i, o) -> {
            double result = s.findMedianSortedArrays(i.first, i.second);

            if (result != o) {
                System.out.println("/nTest failed!");
                System.out.println("Input: ");
                ArrayUtils.printArray(i.first);
                ArrayUtils.printArray(i.second);
                System.out.println("Expected: " + o);
                System.out.println("Actual: " + result);
            }
            else {
                System.out.println("Test passed!");
            }
        });

    }
}
