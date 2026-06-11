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
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        boolean ans = false;
        ListNode slow = head;
        ListNode fast = head;
        slow = slow.next;
        if (slow == null)
            return false;
        fast = fast.next.next;
        // edge case
        if (fast == null || fast.next==null)
            return false;
        if(slow==fast) return true;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
            if(fast==null){
                return false;
            }
        }
        return ans;
    }
}
