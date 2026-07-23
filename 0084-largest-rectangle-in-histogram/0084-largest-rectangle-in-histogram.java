import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=heights.length;i++){
            int cur=i==heights.length?0:heights[i];
            while(!s.isEmpty() && cur<heights[s.peek()]){
                int height=heights[s.pop()];
                int width;
                if(s.isEmpty()){
                    width=i;
                }
                else{
                    width=i-s.peek()-1;
                }
                maxArea=Math.max(maxArea,height*width);
            }
            s.push(i);

        }
        return maxArea;
    }
}