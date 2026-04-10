class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int candidate=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i:nums){
            if(candidate==i){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }
        return -1;
    }
}