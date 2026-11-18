class Solution {
    public void reverseString(char[] s) {
        Rev(s, 0, s.length - 1);
    }
//  Solve from recursion
    public static void Rev(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        Rev(s, left + 1, right - 1);
    }
}