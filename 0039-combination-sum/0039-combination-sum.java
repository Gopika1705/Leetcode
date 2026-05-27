import java.util.*;

class Solution{
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates,int target){
        backtrack(candidates,target,0,new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] arr,int target,int index,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<arr.length;i++){
            temp.add(arr[i]);
            backtrack(arr,target-arr[i],i,temp);
            temp.remove(temp.size()-1);
        }
    }
}