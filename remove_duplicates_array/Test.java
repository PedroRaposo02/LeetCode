package remove_duplicates_array;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<int[]> testCases = new HashSet<>();
        testCases.add(new int[] { 1, 1, 2 });
        testCases.add(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });

        Solution sol = new Solution();

        testCases.forEach((k) -> {
            System.out.print("\n\nTest case: ");
            for (int i = 0; i < k.length; i++) {
                System.out.print(k[i] + " ");
            }
            int res = sol.removeDuplicates(k);
            System.out.print("\nResult case: ");
            for (int i = 0; i < res; i++) {
                System.out.print(k[i] + " ");
            }
            System.out.print("\nNumber of uniques: " + res);
        });

    }
}
