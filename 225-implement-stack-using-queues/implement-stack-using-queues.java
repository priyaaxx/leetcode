class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
    }
    
    public void push(int x) {
       while(!q1.isEmpty()){
            q2.add(q1.remove());
       }
       q1.add(x);
       while(!q2.isEmpty()){
            q1.add(q2.remove());
       }
    }
    
    public int pop() {
        int ans = q1.remove();
        return ans;
    }
    
    public int top() {
        if(!q1.isEmpty()){
            return q1.peek();
        } else{
            return -1;
        }
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */