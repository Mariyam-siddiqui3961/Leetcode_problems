//--------------Smallest missing non negative integer--------------
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        Map<Integer, Integer> remainderCount = new HashMap<>();