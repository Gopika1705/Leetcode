class Solution {
    public String minWindow(String s, String t) {
      int m=s.length();
      int n=t.length();
      int freq[]=new int[256];
      int left=0;
      int o=0;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<t.length();i++){
        freq[t.charAt(i)]++;
      }
      int r=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(freq[c]>0){
            r++;
        }
        freq[c]--;
        while(r==n){
            int count=i-left+1;
            if(count<min){
                min=count;
                o=left;
            }
            char l=s.charAt(left);
            freq[l]++;
            if(freq[l]>0){
                r--;
            }
            left++;
        }
      }
      if(min==Integer.MAX_VALUE){
        return "";
      }
      return s.substring(o,o+min);
    }
}