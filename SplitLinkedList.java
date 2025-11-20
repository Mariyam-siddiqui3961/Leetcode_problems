//-------------Split linked list in parts-----------
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];

        // Step 1: Count the length of the linked list
        int length = 0;