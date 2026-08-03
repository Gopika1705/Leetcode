class Solution {
    public int trap(int[] height) {
        Stack<Integer> s=new Stack<>();
        int leftmax=height[0];
        int water=0;
        s.push(height[height.length-1]);
        for(int i=height.length-2;i>=2;i--){
            s.push(Math.max(height[i],s.peek()));
        }
        for(int i=1;i<height.length-1;i++){
            int min=Math.min(leftmax,s.peek());
            water=water+Math.max(0,min-height[i]);
            s.pop();
            leftmax=Math.max(leftmax,height[i]);
        }
        return water;
    }
}