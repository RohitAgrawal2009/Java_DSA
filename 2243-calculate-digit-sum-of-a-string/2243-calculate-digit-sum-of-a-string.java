class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            String next = "";
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                String chunk = s.substring(i, Math.min(i + k, s.length()));
              // Add up all digits in this chunk
                for (char c : chunk.toCharArray()) {
                    sum += c - '0';
                }
                next += sum;
            }
            s = next;
        }
        return s;
    }
}