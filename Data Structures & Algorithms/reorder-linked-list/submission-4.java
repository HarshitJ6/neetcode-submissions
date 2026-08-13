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
    public void reorderList(ListNode head) {
        if(head.next == null || head.next.next == null) return;
        ListNode h1 = head;
        ListNode middle = findMiddle(head);
        System.out.println("Middle->" + middle.val);
        ListNode h2 = reverseList(middle.next);
        middle.next = null;

        ListNode tmp = null;
        while(h2!=null){
            if(tmp == null){
                tmp = h1;
                h1 = h1.next;
                tmp.next = h2;
                tmp = h2;
                h2 = h2.next;
            }else{
                tmp.next = h1;
                tmp = h1;
                h1=h1.next;
                tmp.next = h2;
                tmp = h2;
                h2=h2.next;
            }
        }
        if(h1!=null){
            tmp.next = h1;
        }
    }

    public ListNode findMiddle(ListNode h){
        ListNode slow = h;
        ListNode fast = h;

        while(fast.next!=null){
            fast = fast.next;
            if(fast.next==null){
                break;
            }
            fast=fast.next;
            slow = slow.next;
        }
        return slow;
    }

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
