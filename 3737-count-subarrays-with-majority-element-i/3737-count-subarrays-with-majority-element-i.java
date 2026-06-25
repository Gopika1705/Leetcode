class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
      int ans=0;
      for(int i=0;i<nums.length;i++){
        int tc=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]==target){
                tc++;
            }
            int len=j-i+1;
            if(tc>len/2){
                ans++;
            }
        }
      }
      return ans;
    }
}