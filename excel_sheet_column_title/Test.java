package excel_sheet_column_title;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> cases = new HashMap<>();

        cases.put(1, "A");
        cases.put(28, "AB");
        cases.put(701, "ZY");
        cases.put(2147483647, "FXSHRXW");

        Solution s = new Solution();

        System.out.println("Running tests...");

        cases.forEach((i, o) -> {
            String result = s.convertToTitle(i);

            if (result.equals(o)) {
                System.out.println("\nTest passed!");
            } else {
                System.out.println("\nTest failed!");
                System.out.println("Input: " + i);
                System.out.println("Expected output: " + o);
                System.out.println("Actual output: " + result);
                System.exit(1);
            }
        });
    }
}
