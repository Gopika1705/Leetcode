class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int ts=0;
        for(String value:operations){
            if(value.equals("+")){
                int t1=st.pop();
                int t2=st.peek();
                int res=t2+t1;
                ts+=res;
                st.push(t1);
                st.push(res);
            }
            else if(value.equals("C")){
                ts-=st.pop();
            }
            else if(value.equals("D")){
                int t1=st.peek();
                int ans=t1*2;
                ts+=ans;
                st.push(ans);
            }
            else{
                ts+=st.push(Integer.parseInt(value));
            }
        }
        return  ts;
    }
}