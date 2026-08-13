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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode tmp = head;
        while(tmp!=null){
            count++;
            tmp = tmp.next;
        }
        int enode = count - n + 1;
        System.out.println("Enode is->" + enode);
        if(enode == 1){
            head = head.next;
            return head;
        }

        int i = 1;
        tmp=head;
        while(i<enode-1){
            i++;
            tmp=tmp.next;
        }
        System.out.println("Enode-1 is->" + tmp.val);
        if(tmp.next.next == null){
            tmp.next = null;
        }else{
            tmp.next = tmp.next.next;
        }
        return head;
    }
}
