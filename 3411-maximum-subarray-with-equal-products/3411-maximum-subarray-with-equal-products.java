class Solution {
    public int maxLength(int[] nums) {
        int ans = 2, l = 0;
        long prod = 1;

        for (int r = 0; r < nums.length; r++) {
            while (gcd(prod, nums[r]) > 1) {
                prod /= nums[l++];
            }
            prod *= nums[r];
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}