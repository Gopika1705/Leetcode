class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        StringBuilder row[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            row[i]=new StringBuilder();
        }
        int cr=0;
        boolean down=false;
        for(char c:s.toCharArray()){
            row[cr].append(c);
            if(cr==0){
                down=true;
            }
            else if(cr==numRows-1){
                down=false;
            }
            if(down==true){
                cr++;
            }
            else{
                cr--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder res:row){
            ans.append(res);
        }
        return ans.toString();
    }
}