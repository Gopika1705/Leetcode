class Solution { 
    public boolean checkInclusion(String s1, String s2) { 
        int n=s1.length();
        if(n>s2.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=s2.length()-n;i++){
            int t[]=new int[26];
            for(int j=i;j<i+n;j++){
                t[s2.charAt(j)-'a']++;
            }
            boolean f=true;
            for(int k=0;k<26;k++){
                if(count[k]!=t[k]){
                    f=false;
                    break;
                }
            }
            if(f) return true;
        }
        return false;
    } 
}