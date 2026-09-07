class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<numRows){
            return s;
        }
        StringBuilder row[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            row[i]=new StringBuilder();
        }
        int c=0;
        boolean down=false;
        for(char ch:s.toCharArray()){
            row[c].append(ch);
            if(c==0){
                down=true;
            }
            else if(c==numRows-1){
                down=false;
            }
            if(down==true){
                c++;
            }
            else if(down==false){
                c--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder sb:row){
            ans.append(sb);
        }
        return ans.toString();
    }
}