class Solution {
    public int singleNumber(int[] nums) {
    int xor = 0;
    for(int i = 0 ; i <= nums.length-1 ; i++){
        xor = xor ^ nums[i];
    }
    return xor;
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna