package Utils;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int... values) {
        if (values.length == 0) {
            return;
        }

        this.val = values[0];

        ListNode current = this;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getLength() {
        int length = 0;

        ListNode current = this;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    public int[] toArray() {
        int[] result = new int[getLength()];

        ListNode current = this;

        for (int i = 0; i < result.length; i++) {
            result[i] = current.val;
            current = current.next;
        }

        return result;
    }

    @Override
    public String toString() {
        return val + (next != null ? (" -> " + next.toString()) : "");
    }

    public boolean equals(ListNode other) {
        return this.toString().equals(other.toString());
    }



}
