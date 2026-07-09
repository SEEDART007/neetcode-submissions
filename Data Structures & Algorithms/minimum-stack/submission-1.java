class MinStack {
     Stack<Integer> minStk;
     Stack<Integer> stk;
    public MinStack() {
        minStk = new Stack<>();
        stk = new Stack<>();
    }
    
    public void push(int val) {
        if(minStk.isEmpty() || val<=minStk.peek()){
            minStk.push(val);
        }
        stk.push(val);
    }
    
    public void pop() {
        if(minStk.peek().equals(stk.peek())){
            minStk.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}
