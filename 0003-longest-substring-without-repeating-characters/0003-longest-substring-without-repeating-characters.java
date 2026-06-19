class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int ws=0;
        int len=0;
        int freq[]=new int[128];
        for(int we=0;we<s.length();we++){
            freq[s.charAt(we)]++;
            while(freq[s.charAt(we)]>1){
                freq[s.charAt(ws)]--;
                ws++;
            }
            len=we-ws+1;
            max=Math.max(len,max);
        }
        return max;
    }
}