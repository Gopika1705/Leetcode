class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
        int ws=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        int required=t.length();
        for(int we=0;we<s.length();we++){
           char ch=s.charAt(we);
           if(freq[ch]>0){
            required--;
           }
           freq[ch]--;
           while(required==0){
            int wlen=we-ws+1;
            if(wlen<minlen){
                minlen=wlen;
                start=ws;
            }
            char leftchar=s.charAt(ws);
            freq[leftchar]++;
            if(freq[leftchar]>0){
                required++;
            }
            ws++;
           }   
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}