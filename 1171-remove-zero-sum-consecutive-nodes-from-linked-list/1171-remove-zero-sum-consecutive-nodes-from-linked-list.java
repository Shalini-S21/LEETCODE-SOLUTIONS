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
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode result = new ListNode(0);
        result.next = head;

        HashMap<Integer, ListNode> map = new HashMap<>();

        int sum = 0;
        ListNode curr = result;

        // First pass: store the LAST node for each prefix sum
        while (curr != null) {
            sum += curr.val;
            map.put(sum, curr);
            curr = curr.next;
        }

        // Second pass: skip zero-sum nodes
        sum = 0;
        curr = result;

        while (curr != null) {
            sum += curr.val;
            curr.next = map.get(sum).next;
            curr = curr.next;
        }

        return result.next;
    }
}