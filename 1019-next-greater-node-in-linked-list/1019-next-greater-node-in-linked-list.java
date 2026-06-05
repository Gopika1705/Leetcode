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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode runner;
        while(temp!=null){
            int max=0;
            runner=temp.next;
            while(runner!=null){
                if(runner.val>temp.val){
                    max=runner.val;
                    break;
                }
                runner=runner.next;
            }
            arr.add(max);
            temp=temp.next;   
        }
        int answer[]=new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}