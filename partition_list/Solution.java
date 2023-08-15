package partition_list;

import java.util.ArrayList;
import java.util.List;

import Utils.ListNode;

public class Solution {
    /*
     * Given the head of a linked list and a value x, partition it such that all
     * nodes less than x come before nodes greater than or equal to x.
     * 
     * You should preserve the original relative order of the nodes in each of the
     * two partitions.
     */

    /*
     * List Bad approach
     */
    public ListNode partition2(ListNode head, int x) {

        if (head == null)
            return null;
        if (head.next == null)
            return head;

        List<Integer> list = new ArrayList<>();
        List<Integer> greaterOrEqualThanX = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                list.add(current.val);
            } else {
                System.out.println(current.val);
                greaterOrEqualThanX.add(current.val);
            }
            current = current.next;
        }

        list.addAll(greaterOrEqualThanX);

        ListNode newHead = new ListNode(list.get(0));
        ListNode newCurrent = newHead;
        for (int i = 1; i < list.size(); i++) {
            newCurrent.next = new ListNode(list.get(i));
            newCurrent = newCurrent.next;
        }
        System.out.println(newHead);
        return newHead;
    }
    
    /*
     * ListNodes Good approach
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode lessThanX = new ListNode(0);
        ListNode greaterOrEqualThanX = new ListNode(0);

        ListNode smalledHead = lessThanX;
        ListNode greaterHead = greaterOrEqualThanX;

        while (head != null) {
            if (head.val < x) {
                smalledHead.next = head;
                smalledHead = smalledHead.next;
            } else {
                greaterHead.next = head;
                greaterHead = greaterHead.next;
            }
            head = head.next;
        }

        smalledHead.next = greaterOrEqualThanX.next;
        greaterHead.next = null;
        
        return lessThanX.next;
    }
}
