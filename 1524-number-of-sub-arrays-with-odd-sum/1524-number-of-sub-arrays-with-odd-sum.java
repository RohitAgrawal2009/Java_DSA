class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int count = 0;
        int prefixSum = 0;
        int oddCount = 0;
        int evenCount = 1;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                // To get an odd sum, we need to subtract an odd prefix sum
                count = (count + oddCount) % MOD;
                evenCount++;
            } else {
                // To get an odd sum, we need to subtract an even prefix sum
                count = (count + evenCount) % MOD;
                oddCount++;
            }
        }

        return count;
    }
}