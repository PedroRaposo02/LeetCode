package merge_sorted_list;

import java.util.HashMap;
import java.util.Map;

import Utils.ListNode;
import Utils.Pair;

public class Test {

    /*
     * Won't Run all the tests cause of wrong implementation of ListNode to mimick LeetCode's ListNode
     */
    public static void main(String[] args) {

        Map<Pair<ListNode, ListNode>, ListNode> testCases = new HashMap<>();

        testCases.put(new Pair<>(new ListNode(), new ListNode()), new ListNode());
        testCases.put(new Pair<>(new ListNode(1), new ListNode()), new ListNode(1));
        testCases.put(new Pair<>(new ListNode(), new ListNode(1)), new ListNode(1));
        testCases.put(new Pair<>(new ListNode(1), new ListNode(1)), new ListNode(1, 1));
        testCases.put(new Pair<>(new ListNode(1,2,4), new ListNode(1,3,4)), new ListNode(1,1,2,3,4,4));

        Solution s = new Solution();

        System.out.println("Running tests...");

        testCases.forEach((input, output) -> {
            ListNode result = s.mergeTwoLists(input.getFirst(), input.getSecond());

            if (result.equals(output)) {
                System.out.println("Test case passed!");
            } else {
                System.out.println("Test case failed:");
                System.out.println("Input: " + input.getFirst() + ", " + input.getSecond());
                System.out.println("Expected output: " + output);
                System.out.println("Actual output: " + result);
            }
        });
    }
}
