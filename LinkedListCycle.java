//---------------Linked List cycle----------
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;