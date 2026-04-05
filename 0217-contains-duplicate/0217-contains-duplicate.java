class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Set <Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        if(n!=st.size())
            return true;
        return false;
    }
}