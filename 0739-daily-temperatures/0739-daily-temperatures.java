class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int answer[] = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
            int prev = stack.pop();
            answer[prev] = i-prev;
            }
            stack.push(i);
        }
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna