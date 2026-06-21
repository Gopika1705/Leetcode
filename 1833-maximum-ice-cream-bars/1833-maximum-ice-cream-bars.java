class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int buy=0;
        int c=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                buy+=costs[i];
                coins=coins-costs[i];
                c++;
            }
        }
        return c;
    }
}