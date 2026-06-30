class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int ans[]=new int[nums.length-k+1];
       int idx=0;
       Deque<Integer> q=new LinkedList<>();
       for(int i=0;i<nums.length;i++){
        while(!q.isEmpty() && q.peekFirst()<=i-k){
            q.pollFirst();
        }
        while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
            q.pollLast();
        }
        q.offer(i);
        if(i>=k-1){
            ans[idx++]=nums[q.peekFirst()];
        }
       }
       return ans;
    }
}