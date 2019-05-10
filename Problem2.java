/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode trackHead = null;
        int carry = 0;
        int a,b;
        while(l1!=null || l2!=null){
            if(l1==null)
                a=0;
            else
                a=l1.val;
            if(l2 == null)
                b=0;
            else 
                b=l2.val;
            int sum = a + b + carry;
                carry = sum/10;
                sum = sum%10;
            ListNode result = new ListNode(sum);
            if(head == null){
                head = result;
                trackHead = result;
                }
            else{
                head.next = result;
                result.next = null;
                head=result;
            }
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry > 0){
            ListNode result = new ListNode(carry);
            head.next=result;
        }
     return trackHead;   
    }
}