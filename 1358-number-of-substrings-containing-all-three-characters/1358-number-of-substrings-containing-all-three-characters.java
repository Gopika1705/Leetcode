class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int start=0;
        int freq[]=new int[3];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=s.length()-i;
                freq[s.charAt(start)-'a']--;
                start++;
            }
        }
        return count;
    }
}