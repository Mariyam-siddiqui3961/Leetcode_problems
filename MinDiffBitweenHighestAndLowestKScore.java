//-------------Minimum diff between highest and lowest k score----------------------
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;

        if (k == 1) return 0;
        Arrays.sort(nums);