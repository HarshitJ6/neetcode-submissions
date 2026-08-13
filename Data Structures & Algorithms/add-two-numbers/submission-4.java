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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        int carry = 0;
        ListNode i=l1,j=l2;
        while(i!=null && j!=null){
            int sum = i.val+j.val + carry;
            int currCarry = sum>=10?1:0;
            sum=sum%10;

            System.out.println(sum +"->" + currCarry);

            carry = currCarry;
            
            ListNode node = new ListNode(sum);
            if(head==null){
                head = node;
                temp=node;
            }else{
                temp.next = node;
                temp=node;
            }

            i=i.next;
            j=j.next;
        }
        if(i == null && j == null && carry > 0){
            ListNode node = new ListNode(carry);
            temp.next = node;
            temp = node;
            carry=0;
        }

        if(i!=null){
            while(i!=null){
                int sum = i.val + carry;
                ListNode node = new ListNode(sum%10);
                carry = (i.val + carry) / 10;
                temp.next = node;
                temp = node;
                i=i.next;
            }
        }

        if(j!=null){
            while(j!=null){
                int sum = j.val + carry;
                ListNode node = new ListNode(sum%10);
                carry = (j.val + carry) / 10;
                temp.next = node;
                temp = node;
                j=j.next;
            }
        }

        if(carry > 0){
            System.out.println(carry);
            ListNode node = new ListNode(carry);
            temp.next = node;
            temp = node;
        }

        return head;
    }
}
