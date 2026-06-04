class Solution {
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public int maxVowels(String s, int k) {
        int msum=0;
        int sum=0;
        int ws=0;
        for(int we=0;we<s.length();we++){
            if(isVowel(s.charAt(we))){
                sum++;
            }
            if(we>=k){
                if(isVowel(s.charAt(ws))){
                    sum--;
                }
                ws++;
            }
            msum=Math.max(sum,msum);
        }
        return msum;
    }
}