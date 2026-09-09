class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int n = s.length();
        int max = 0;
        // First window
        for (int i = 0; i < k; i++) {
            if (isvowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Remove outgoing character
            if (isvowel(s.charAt(i - k))) {
                count--;
            }

            // Add incoming character
            if (isvowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;

    }

    public boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }
}
