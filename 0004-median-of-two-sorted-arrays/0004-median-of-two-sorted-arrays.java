class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx=0;
        int n=nums1.length+nums2.length;
        int arr[]=new int[n];
        for(int i=0;i<nums1.length;i++){
            arr[idx++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[idx++]=nums2[i];
        }
        Arrays.sort(arr);
        if(n%2==1){
            return arr[n/2];
        }
        else{
            return (arr[n/2]+arr[(n-1)/2])/2.0;
        }
    }
}