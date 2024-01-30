package medium.q2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        boolean hasCarryOn = false;

        ListNode retornoHead = new ListNode();
        ListNode atual = retornoHead;
        while (l1 != null || l2 != null || hasCarryOn) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            sum = val1 + val2 + (hasCarryOn ? 1 : 0);

            hasCarryOn = sum >= 10;
            sum %= 10;

            atual.next = new ListNode(sum);
            atual = atual.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return retornoHead.next;
    }
}
