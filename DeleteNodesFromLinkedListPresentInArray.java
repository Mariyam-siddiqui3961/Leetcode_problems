//----------delete nodes from linked list present in array-------------
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }