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