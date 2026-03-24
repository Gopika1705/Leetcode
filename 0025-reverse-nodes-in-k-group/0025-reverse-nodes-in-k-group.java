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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        while(true){
            ListNode temp=prev;
            int tc=0;
            while(tc<k && temp!=null){
                temp=temp.next;
                tc++;
            }
            if(tc<k) break;
            if(temp==null){
                break;
            }
            ListNode current=prev.next;
            ListNode previous=null;
            ListNode next=null;
            int cnt=0;
            ListNode res=current;
            while(cnt<k && current!=null){
                next=current.next;
                current.next=previous;
                previous=current;
                current=next;
                cnt++;
            }
            prev.next=previous;
            res.next=current;
            prev=res;
        }
        return dummy.next;
    }
}