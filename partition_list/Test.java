package partition_list;

import java.util.HashMap;
import java.util.Map;

import Utils.ListNode;

public class Test {
    public static void main(String[] args) {

        Map<ListNode, ListNode> map = new HashMap<>();

        ListNode head = new ListNode(1);
        ListNode currentNode = head;
        currentNode.next = new ListNode(4);
        currentNode = currentNode.next;
        currentNode.next = new ListNode(3);
        currentNode = currentNode.next;
        currentNode.next = new ListNode(2);
        currentNode = currentNode.next;
        currentNode.next = new ListNode(5);
        currentNode = currentNode.next;
        currentNode.next = new ListNode(2);

        ListNode solutionHead = new ListNode(1);
        ListNode currentSolutionHead = solutionHead;
        currentSolutionHead.next = new ListNode(2);
        currentSolutionHead = currentSolutionHead.next;
        currentSolutionHead.next = new ListNode(2);
        currentSolutionHead = currentSolutionHead.next;
        currentSolutionHead.next = new ListNode(4);
        currentSolutionHead = currentSolutionHead.next;
        currentSolutionHead.next = new ListNode(3);
        currentSolutionHead = currentSolutionHead.next;
        currentSolutionHead.next = new ListNode(5);

        map.put(head, solutionHead);

        Solution solution = new Solution();

        System.out.println("Running tests...");

        map.forEach((i, o) -> {
            ListNode result = solution.partition(i, 3);
            if (result.equals(o)) {
                System.out.println("Test passed!");
            } else {
                System.out.println("Test failed");
            }
        });
    }
}
