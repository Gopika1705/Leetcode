class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int ts=0;
        for(int i=0;i<n;i++){
            ts+=nums[i];
        }
        int ls=0;
        for(int i=0;i<n;i++){
            if(ls==ts-ls-nums[i]){
                return i;
            }
            ls=ls+nums[i];
        }
        return -1;
    }
}