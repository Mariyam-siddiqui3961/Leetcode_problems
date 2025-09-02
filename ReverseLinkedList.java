//-----------Reverse Linked List---------------------
class Solution {
    public ListNode reverseList(ListNode head) {
        if ( head == null || head.next==null){
            return head;