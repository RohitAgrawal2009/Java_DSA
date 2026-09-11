class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) {
            return result;
        }
        int[] fq1 = new int[128];
        int[] fq2 = new int[128];
        int l = 0;
        int r = 0;
        while (r < p.length()) {
            fq1[p.charAt(r)]++;
            fq2[s.charAt(r)]++;
            r++;

        }
        if (Arrays.equals(fq1, fq2)) {
            result.add(l);
        }
        while (r < s.length()) {
            fq2[s.charAt(r)]++;
            fq2[s.charAt(l)]--;
            l++;
            r++;
            if (Arrays.equals(fq1, fq2)) {
                result.add(l);
            }
        }
        return result;
    }
}