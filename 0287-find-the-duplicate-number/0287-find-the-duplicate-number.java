class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> arr=new HashSet<>();
       for(int num:nums){
        if(arr.contains(num)){
            return num;
        }
        arr.add(num);
       }
       return -1;
       
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;
    }
}