class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
        // ORRR
        // int[] arr = new int[n + 1];
        // for (int i = 0; i < n; i++) {
        //     arr[nums[i]]++;
        // }
        // for (int i = 1; i <= n; i++) {
        //     if (arr[i] == 0) {
        //         ans.add(i);
        //     }
        // }
        // return ans;
        // for (int target = 1; target <= n; target++) {
        //     boolean found = false;
        //     for (int j = 0; j < n; j++) {
        //         if (target == nums[j]) {
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (!found) {
        //         ans.add(target);
        //     }
        // }   TLEEEEEEEEEEEE
        // return ans;
    }
}