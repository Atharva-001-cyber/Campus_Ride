class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase();
        int i = 0 ;
        int j = st.length()-1;
        while (i<j){
            while(i < j && !Character.isLetterOrDigit(st.charAt(i))){
                i++;
            }
             while(i < j && !Character.isLetterOrDigit(st.charAt(j))){
                j--;
             }
             if(st.charAt(i) != st.charAt(j)){
                return false;
             }
             i++;
             j--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna