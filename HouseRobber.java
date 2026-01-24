//-----------------------House robber------------------------
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int [] dp = new int [n];