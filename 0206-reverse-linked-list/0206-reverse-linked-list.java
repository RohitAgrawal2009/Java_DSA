
import java.util.ArrayList;

class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        // Step 1: Store all values in array
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Put values back in reverse order
        temp = head;
        int i = arr.size() - 1;

        while (temp != null) {
            temp.val = arr.get(i);
            i--;
            temp = temp.next;
        }

        return head;
    }
}
