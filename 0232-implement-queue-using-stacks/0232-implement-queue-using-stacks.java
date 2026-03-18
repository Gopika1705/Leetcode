class MyQueue {
    Stack<Integer> st;
    Stack<Integer> hs;
    public MyQueue() {
        st=new Stack<>();
        hs=new Stack<>();
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            hs.push(st.pop());
        }
        st.push(x);
        while(!hs.isEmpty()){
            st.push(hs.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */