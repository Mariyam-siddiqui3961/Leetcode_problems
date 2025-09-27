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
        //reverse second half
        ListNode secondHalf = reverseList(slow);
        ListNode copySecondHalf = secondHalf;    // to restore later if needed

        // compare halves
        ListNode firstHalf = head;
        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;  
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}