class Solution {
    public List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        gen(0,0,"",n);
        return res;
    }
    public void gen(int op,int c1,String s,int n){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(op<n){
            gen(op+1,c1,s+"(",n);
        }
        if(c1<op){
            gen(op,c1+1,s+")",n);
        }
    }
}