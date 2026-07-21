class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum = nums[0];
        int max_sum = nums[0];
        for(int i =1; i < nums.length; i++){
            current_sum = Math.max(nums[i] , current_sum + nums[i]);
            max_sum = Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna