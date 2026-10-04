class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int n = s.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if ("aeiou".indexOf(s.charAt(i)) >= 0) {
                count++;
            }
            if (i >= k && "aeiou".indexOf(s.charAt(i - k)) >= 0) {
                count--;
            }
            if (i >= k - 1) {
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
