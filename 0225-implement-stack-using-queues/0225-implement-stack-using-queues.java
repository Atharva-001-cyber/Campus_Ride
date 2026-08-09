class MyStack {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        B.add(x);

        while (!A.isEmpty()) {
            B.add(A.remove());
        }

        while (!B.isEmpty()) {
            A.add(B.remove());
        }
    }
    
    public int pop() {
         return A.remove();
    }
    
    public int top() {
         return A.peek();
    }
    
    public boolean empty() {
        return A.isEmpty();
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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna