class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int nums2[]=new int[n];
        int dis=0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                dis++;
            }
            else{
                dis--;
            }
        }
        if(dis==n){
            int a=0;
            int b=0;
            while(b<n){
                nums2[a++]=nums1[b++];
            }
            return true;
        }
        int ov=0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                ov=nums1[i];
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                nums2[i]=nums1[i]-ov;
            }
            else{
                nums2[i]=nums1[i];
            }
            return true;
        }
        return true;
    }
}