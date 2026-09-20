class Solution {
    public void sortColors(int[] nums) {
        //  Arrays.sort(nums);

        // or next solution ..............

        // int count0 = 0;
        // int count1 = 0;
        // int count2  = 0;
        // for(int i=0;i<n;i++){
        //     if(nums[i] == 0) count0++;
        //     else if(nums[i] == 1) count1++;
        //     else count2++;
        // }
        // int indx = 0;
        // for(int i=0;i<count0;i++){
        //     nums[indx++] = 0;
        // }
        // for(int i=0;i<count1;i++){
        //     nums[indx++] = 1;
        // }
        // for(int i=0;i<count2;i++){
        //     nums[indx++] = 2;
        // }

        /// orr next Approah;
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int temp = nums[i];
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }

    }
}