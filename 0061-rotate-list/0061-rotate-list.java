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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode temp=head;
        int n=1;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        temp.next=head;
        k=k%n;
        int s=n-k;
        ListNode rotate=head;
        for(int i=1;i<s;i++){
            rotate=rotate.next;
        }
        ListNode newnode=rotate.next;
        rotate.next=null;
        return newnode;
    }
}