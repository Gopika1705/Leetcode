class Solution {
    public String minWindow(String s, String t) {
      int freq[]=new int[256];
      for(int i=0;i<t.length();i++){
        freq[t.charAt(i)]++;
      }
      int ws=0;
      int minlen=Integer.MAX_VALUE;
      int start=0;
      int required=t.length();
      for(int we=0;we<s.length();we++){
        char c=s.charAt(we);
        if(freq[c]>0){
            required--;
        }
        freq[c]--;
        while(required==0){
            int wlen=we-ws+1;
            if(wlen<minlen){
                minlen=wlen;
                start=ws;
            }
            char l=s.charAt(ws);
            freq[l]++;
            if(freq[l]>0){
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