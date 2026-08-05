class Solution {
    public int minAddToMakeValid(String s) {
 Stack<Character> stack = new Stack<>();
        int moves = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {

                if (!stack.isEmpty()) {
                    stack.pop();      // Matched with an opening bracket
                } else {
                    moves++;          // Need one '(' before this ')'
                }
            }
        }

        // Remaining '(' each need one ')'
        moves += stack.size();

        return moves;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna