class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0];
       int p=0;
       for(int i=0;i<prices.length;i++){
        if(min>prices[i]){
            min=prices[i];
        }
        else if(p<prices[i]-min){
            p=prices[i]-min;
        }
       }
       return p;
    }
}