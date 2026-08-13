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
        ListNode rhead = null;
        ListNode tmp = null;
        ListNode fhead = list1;
        ListNode shead = list2;

        if(list1==null || list2 ==null){
            return list1==null? list2 : list1;
        }

        while(fhead != null && shead !=null){
            if(fhead.val == shead.val){
                if(rhead == null){
                    rhead = fhead;
                    tmp = fhead;
                    fhead=fhead.next;
                    tmp.next = shead;
                    tmp = shead;
                    shead=shead.next;
                }else{
                    tmp.next = fhead;
                    tmp = fhead;
                    fhead=fhead.next;
                    tmp.next = shead;
                    tmp = shead;
                    shead=shead.next;
                } 
            }else if(fhead.val < shead.val){
                if(rhead == null){
                    rhead = fhead;
                    tmp = fhead;
                }else{
                    tmp.next = fhead;
                    tmp=fhead;
                } 
                fhead = fhead.next;
            }else{
                if(rhead == null) {
                    rhead = shead;
                    tmp = shead;
                }else{
                    tmp.next = shead;
                    tmp=shead;
                }
                shead = shead.next;
            }
        }
        if(fhead!=null){
            while(fhead !=null){
                tmp.next = fhead;
                tmp=fhead;
                fhead = fhead.next;
            }
        }

        if(shead!=null){
            while(shead!=null){
                tmp.next = shead;
                tmp=shead;
                shead = shead.next;
            }
        }

        return rhead;
    }
}