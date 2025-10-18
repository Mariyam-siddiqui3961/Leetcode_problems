//-------------maximum number of distinct element----------------
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long last = Long.MIN_VALUE;