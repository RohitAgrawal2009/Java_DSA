class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if (s1.length() > s2.length())
            return false;
        int[] fq1 = new int[128];
        int[] fq2 = new int[128];
        int l = 0;
        int r = 0;
        while (r < n) {
            fq1[s1.charAt(r)]++;
            fq2[s2.charAt(r)]++;
            r++;
        }
        if (Arrays.equals(fq1, fq2)) {
            return true;
        }
        while (r < s2.length()) {
            fq2[s2.charAt(r)]++;
            fq2[s2.charAt(l)]--;
            l++;
            r++;
            if (Arrays.equals(fq1, fq2)) {
                return true;
            }
        }
        return false;
    }
}