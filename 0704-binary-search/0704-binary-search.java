class Solution {
    public int search(int[] nums, int target) {
        int l = 0; // l = left;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;

        // orrr but not submitted Because its have wrost time complexity;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //         return i;
        //     }
        // }
        // return -1;
    }
}