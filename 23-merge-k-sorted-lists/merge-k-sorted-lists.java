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
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        ListNode dummy = new ListNode(-1);
        ListNode Dtemp = dummy;
        for(int i=0;i<arr.size();i++){
            ListNode n = new ListNode(arr.get(i));
            Dtemp.next = n;
            Dtemp = Dtemp.next;
        }
        return dummy.next;
    }
}