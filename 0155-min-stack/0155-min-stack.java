class MinStack {
        Stack<Integer> stack = new Stack<>();
         Stack<Integer> minstack = new Stack<>();
    public MinStack() {

    }
    
    public void push(int value) {
        stack.push(value);
        if(minstack.isEmpty()){
        minstack.push(value);
        }else{
            minstack.push(Math.min(value,minstack.peek()));
        }
    }
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna