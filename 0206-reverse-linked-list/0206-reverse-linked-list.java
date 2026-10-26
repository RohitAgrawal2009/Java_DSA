
class Solution {
    public ListNode reverseList(ListNode head) {
        int count = 0;
        ListNode temp = head;

        // Step 1: Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Create array
        int[] array = new int[count];
        int p = count - 1;

        // Step 3: Store values in reverse order
        temp = head;
        while (temp != null) {
            array[p] = temp.val;
            temp = temp.next;
            p--;
        }

        // Step 4: Copy values back into linked list
        temp = head;
        p = 0;

        while (temp != null) {
            temp.val = array[p];
            temp = temp.next;
            p++;
        }

        return head;
    }
}

