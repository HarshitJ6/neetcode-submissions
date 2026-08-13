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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode a = head;
        ListNode b = head.next;

        a.next = null;
        while(b!=null){
            ListNode tmp = b.next;
            b.next = a;
            a = b;
            b = tmp;
        }

        return a;
    }
}
