class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int c1=nums[i];
            maxsum=Math.max(c1,maxsum+c1);
            max=Math.max(max,maxsum);
        }
        return max;
    }
}