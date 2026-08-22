class Solution {
    public boolean checkDivisibility(int n) {
        int ans=n;
        int sum=0;
        int pro=1;
        while(ans>0){
            int r=ans%10;
            sum+=r;
            pro*=r;
            ans/=10;
        }
        if(n%(sum+pro)==0){
            return true;
        }
        return false;
    }
}