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
       //Find the midpoint
       ListNode slow = head;
       ListNode fast = head;
       while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
       }

       //Reverse the second half
       ListNode prev = null;
       ListNode curr = slow;
       ListNode next;
       while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
       }

       //Reorder the list
        ListNode first = head;
        ListNode second = prev;
        while(second!=null && first!=null){
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }
    }
}