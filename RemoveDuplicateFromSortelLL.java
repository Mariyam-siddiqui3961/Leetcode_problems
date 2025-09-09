//--------------Remove Duplicate From Sorted Linked List----------------------
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
         ListNode current = head;

        while(current !=null && current.next !=null){
            if(current.val == current.next.val){