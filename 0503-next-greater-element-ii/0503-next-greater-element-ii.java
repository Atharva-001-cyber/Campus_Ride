class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
         int ans[] = new int[n];
         Arrays.fill(ans, -1);
         Stack<Integer> stack = new Stack<>();
         for(int i = 0 ; i < 2*n ; i++)
{
        int curr = i % n;
        while(!stack.isEmpty() && nums[curr] > nums[stack.peek()]){
            int index = stack.pop();
            ans[index] = nums[curr];  
        }
            stack.push(curr);
}
return ans;  
  }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna