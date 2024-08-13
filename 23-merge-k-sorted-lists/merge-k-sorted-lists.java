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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
       ListNode head = lists[0];
       for(int i=1;i<lists.length;i++){
            head = merge2Lists(head, lists[i]);
       }
       return head;
    }

    public ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else{
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        if(l1!=null){
            temp.next = l1;
        } else if(l2!=null){
            temp.next = l2;
        }
        return dummy.next;
    }
}