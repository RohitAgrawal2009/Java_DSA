class Solution {
    public int mySqrt(int x) {
        long left = 0, right = x;
        while (left < right) {
            long mid = (left + right + 1) >>> 1;
            if (mid * mid <= x)
                left = mid;
            else
                right = mid - 1;
        }
        return (int) left;
    }
}