
class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder sb = new StringBuilder();
        int c = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '-') {
                continue;
            }

            if (c == k) {
                sb.append('-');
                c = 0;
            }

            sb.append(Character.toUpperCase(s.charAt(i)));
            c++;
        }

        return sb.reverse().toString();
    }
}