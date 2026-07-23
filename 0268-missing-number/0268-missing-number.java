class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_sum = 0;
        int expected_sum = n*(n+1)/2;
        for(int i = 0 ; i <= nums.length-1 ; i++){
            actual_sum = actual_sum + nums[i];
        }
        return expected_sum - actual_sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna