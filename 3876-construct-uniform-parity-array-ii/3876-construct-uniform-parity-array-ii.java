class Solution {
    public boolean uniformArray(int[] nums1) {
        int o=0;
        int e=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                o++;
            }
            else{
                e++;
            }
        }
        if((o==0 && e>0) || (o>0 && e==0)){
            return true;
        }
        int ov=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                ov=Math.min(nums1[i],ov);
            }
        }
        int nums2[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                nums2[i]=nums1[i]-ov;
            }
            else{
                nums2[i]=nums1[i];
            }
        }
        int fp = nums2[0] % 2;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]%2!=fp){
                return false;
            }
        }
        return true;
    }
}