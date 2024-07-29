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
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode curr = head;
        int length = 0;
        while(curr!=null){
            length++;
            list.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int i=0;
        int j=list.size()-1;
        while(i<j){
            ans.add(list.get(i));
            ans.add(list.get(j));
            i++;
            j--;
        }
        if(length % 2!=0){
            ans.add(list.get(i));
        }
        System.out.println(ans);
        
       ListNode dNode = new ListNode(-1);
       ListNode temp = dNode;
       i=1;
       while(i<ans.size()){
            temp.next = new ListNode(ans.get(i));
            i++;
            temp = temp.next;
       }
       head.next = dNode.next;
    }
}