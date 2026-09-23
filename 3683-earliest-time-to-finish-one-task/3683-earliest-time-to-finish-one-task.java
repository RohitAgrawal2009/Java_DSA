class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            int sum = 0;
            for (int j = 0; j < tasks[i].length; j++) {
                sum = sum + tasks[i][j];
            }
            if (sum < min)
                min = sum;
        }
        return min;
    }
}