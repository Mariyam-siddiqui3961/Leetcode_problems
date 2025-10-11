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
        // Step 3: Reverse the sublist from left to right
        ListNode curr = prev.next;      // first node of sublist
        ListNode next = null;
        ListNode prevSub = null;

        for (int i = 0; i <= right - left; i++) {
            next = curr.next;
            curr.next = prevSub;
            prevSub = curr;
            curr = next;
        }
        // Step 4: Connect reversed sublist back
        prev.next.next = curr;   // tail of reversed part connects to rest
        prev.next = prevSub;     // connect start of reversed part

        // Step 5: Return new head
        return dummy.next;

    }
}
