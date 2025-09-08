//-----------Reverse Linked List---------------------
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if ( head == null || head.next==null){
//             return head;
//             }
//         ListNode reversedList = reverseList(head.next);
//         head.next.next = head;
//         head.next= null;
//          return reversedList;
//     }
// }


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
            while(curr != null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
    }
}
