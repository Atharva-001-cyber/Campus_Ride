class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Initially -1
        for (int i = 0; i < n; i++) {
            answer[i] = -1;
        }

        // Traverse array twice
        for (int i = 0; i < 2 * n; i++) {

            int current = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < current) {
                int prev = stack.pop();
                answer[prev] = current;
            }

            // Only push indices during first traversal
            if (i < n) {
                stack.push(i);
            }
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna