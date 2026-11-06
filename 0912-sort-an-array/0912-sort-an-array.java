class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Recursively sort the left and right halves
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        // Merge the sorted halves
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Compare elements from both halves and put the smaller one into temp
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements from the right half, if any
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // Copy back the sorted elements into the original array
        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}