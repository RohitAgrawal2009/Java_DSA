class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        int w = 2 * k + 1;
        if (k == 0)
            return nums;
        Arrays.fill(res, -1);
        if (n < w)
            return res;

        int l = 0;
        int r = 0;
        long sum = 0;
        while (r < w) {
            sum += nums[r];
            r++;
        }
        int i = k;
        res[i] = (int) (sum / w);
        while (r < n) {
            sum = sum + nums[r];
            sum = sum - nums[l];
            res[++i] = (int) (sum / w);
            l++;
            r++;
        }
        return res;
    }
}