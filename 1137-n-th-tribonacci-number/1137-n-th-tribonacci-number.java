class Solution {
    public int tribonacci(int n) {
        int[] memo = new int[n + 1];
        java.util.Arrays.fill(memo, -1);
        return tribonacciMemo(n, memo);
    }
    
    private int tribonacciMemo(int n, int[] memo) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        // Return cached result if we already solved it
        if (memo[n] != -1) {
            return memo[n];
        }
        
        // Compute, store in memo array, and return
        memo[n] = tribonacciMemo(n - 1, memo) + tribonacciMemo(n - 2, memo) + tribonacciMemo(n - 3, memo);
        return memo[n];
    }
}