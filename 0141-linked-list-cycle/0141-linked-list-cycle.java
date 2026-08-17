/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    if(head == null || head.next == null)
    return false;
     ListNode slow = null;
     ListNode fast = head;
     if(slow==null && fast==head){
        slow=head;
        fast=fast.next.next;
     }
     while(fast!=slow && (fast!=null && fast.next!=null)){
        slow =slow.next;
        fast=fast.next.next;
     }
     if(slow==fast)
     return true;
     else
     return false;
    }
}