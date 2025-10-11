//--------------reverse linked list II-------------------
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Step 1: Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Move `prev` to the node before 'left'
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }