//---------------First and Last position (Binary Search Application)-------------------
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums , target);
        return new int [] {first, last};
    }
