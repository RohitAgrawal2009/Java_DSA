class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            while (start < end && "aeiouAEIOU".indexOf(ch[start]) == -1)
                start++;
            while (start < end && "aeiouAEIOU".indexOf(ch[end]) == -1)
                end--;
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
}
