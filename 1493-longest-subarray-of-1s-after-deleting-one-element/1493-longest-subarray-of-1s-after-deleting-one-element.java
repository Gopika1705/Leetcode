class Solution {
    public int longestSubarray(int[] nums) {
        int rep=0;
        int maxlen=0;
        int ws=0;
        for(int we=0;we<nums.length;we++){
            if(nums[we]==0){
                rep++;
            }
            while(rep>1){
                if(nums[ws]==0){
                    rep--;
                }
                ws++;
            }
            maxlen=Math.max(maxlen,we-ws);
        }
        return maxlen;
    }
}