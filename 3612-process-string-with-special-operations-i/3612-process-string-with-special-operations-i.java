class Solution {
    public boolean isChar(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        return false;
    }
    public String processStr(String s) {
       StringBuilder str=new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(isChar(ch)){
            str.append(ch);
        }
        else if(ch=='*'){
            if(str.length()>0){
                str.deleteCharAt(str.length()-1);
            }
        }
        else if(ch=='#'){
            str.append(str);
        }
        else if(ch=='%'){
            str.reverse();
        }
       }
       return str.toString();
    }
}