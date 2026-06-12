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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list1==null && list2== null) return null;
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode d = new ListNode(-1);
        ListNode t = d;
        
        //comparision between the values then arrange there pointer
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                t.next=l1;
                l1 = l1.next;
            }else{
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;
        }
        if(l1==null) t.next = l2;
        else{
            t.next = l1;
        }
        return d.next;
    }
}