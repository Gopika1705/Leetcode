class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res[]=new int[k];
        for(int j=0;j<k;j++){
            int max=-1;
            int ans=0;
            for(int i:map.keySet()){
                if(map.get(i)>max){
                    max=map.get(i);
                    ans=i;
                }
            }
            res[j]=ans;
            map.remove(ans);
        }
        return res;
    }
}