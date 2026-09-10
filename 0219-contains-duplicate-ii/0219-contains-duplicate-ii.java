class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < Math.min(k, nums.length); i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            set.remove(nums[i - k]);
        }
        return false;
        //    for(int i=0;i<nums.length;i++){
        //     int j = i+1;
        //     int count =0;
        //     while(j<nums.length && count <k){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //         j++;
        //         count++;
        //     }
        //    }       //  its Also Time limit exceded
        //    return false;

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < i; j++) {
        //         if (nums[i] == nums[j] && i - j <= k) {
        //             return true;
        //         }
        //     }
        // }// time limit excededdd
        // return false;

    }
}