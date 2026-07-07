class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int count=1;
                int current=n;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}