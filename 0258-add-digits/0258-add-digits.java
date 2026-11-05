class Solution {
    public int addDigits(int num) {
        // Base Case 
        if (num < 10) {
            return num;
        }
        // sum the digit of current num
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return addDigits(sum);
    }
}