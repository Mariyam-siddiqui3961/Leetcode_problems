//-------------Split linked list in parts-----------
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];

        // Step 1: Count the length of the linked list
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Step 2: Determine base size and extra nodes
        int baseSize = length / k;     // minimum size of each part
        int extra = length % k;        // first 'extra' parts get 1 more node

        curr = head;
        // Step 3: Split into k parts
        for (int i = 0; i < k; i++) {

            int partSize = baseSize + (i < extra ? 1 : 0);

            if (partSize == 0) {
                result[i] = null;
                continue;
            }

            // The first node of the current part
            result[i] = curr;

            // Move to the last node of this part
            for (int j = 1; j < partSize; j++) {
                curr = curr.next;
            }

            // Cut the list
            ListNode nextPartHead = curr.next;
            curr.next = null;
            curr = nextPartHead;
        }

        return result;
    }
}
