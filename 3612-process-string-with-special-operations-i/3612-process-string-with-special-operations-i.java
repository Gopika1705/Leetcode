class Solution {
    public boolean isChar(char c){
        if((c>='A' && c<='Z') || (c>='a' && c<='z')){
            return true;
        }
        return false;
    }
    public String processStr(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isChar(s.charAt(i))){
                str.append(s.charAt(i));
            }
            if(s.charAt(i)=='#'){
                str.append(str);
            }
            if(s.charAt(i)=='*'){
                if(str.length()>0)
                str.deleteCharAt(str.length()-1);
            }
            if(s.charAt(i)=='%'){
                str.reverse();
            }
        }
        return str.toString();
    }
}