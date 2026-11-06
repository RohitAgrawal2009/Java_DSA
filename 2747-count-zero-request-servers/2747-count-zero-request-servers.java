import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = logs.length;
        int k = queries.length;

        // Sort logs by time
        Arrays.sort(logs, Comparator.comparingInt(a -> a[1]));

        // Create an index array for queries to sort them offline
        Integer[] queryIndices = new Integer[k];
        for (int i = 0; i < k; i++) {
            queryIndices[i] = i;
        }
        Arrays.sort(queryIndices, Comparator.comparingInt(i -> queries[i]));

        int[] ans = new int[k];
        int[] count = new int[n + 1];
        int left = 0, right = 0, active = 0;

        // Process each query in sorted order of time
        for (int i : queryIndices) {
            int q = queries[i];

            // Expand the right boundary to include logs with time <= q
            while (right < m && logs[right][1] <= q) {
                int serverId = logs[right][0];
                if (count[serverId] == 0) {
                    active++;
                }
                count[serverId]++;
                right++;
            }

            // Shrink the left boundary to exclude logs with time < q - x
            while (left < right && logs[left][1] < q - x) {
                int serverId = logs[left][0];
                count[serverId]--;
                if (count[serverId] == 0) {
                    active--;
                }
                left++;
            }

            // Servers with zero requests = total servers (n) - active servers
            ans[i] = n - active;
        }

        return ans;
    }
}