//-----------------Palindrome Linked List-------------
class Solution {
    public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) return true;

        //find middle
        ListNode slow = head;       
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }