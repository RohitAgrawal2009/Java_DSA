class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0 && nums[i] % 2 != 0) {

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }

            if (i % 2 != 0 && nums[i] % 2 == 0) {

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[j] % 2 != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        return nums;
    }
}