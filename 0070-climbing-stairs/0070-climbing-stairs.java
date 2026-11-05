class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        java.util.Arrays.fill(memo, -1);
        return climbStairsMemo(n, memo);
    }
    private int climbStairsMemo(int n, int[] memo) {
        // Base case
        if (n <= 2) {
            return n;
        }
        // Return cached result if already computed
        if (memo[n] != -1) {
            return memo[n];
        }
        // Recursive step: store result in memo array before returning
        memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
        return memo[n];
    }
}