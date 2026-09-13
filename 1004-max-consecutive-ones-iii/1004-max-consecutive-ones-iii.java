class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxans = 0;
        int zeros = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }
}