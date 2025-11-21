//--------------Target sum----------------
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for(int num : nums) sum += num;

        if((target + sum) % 2 != 0 || target > sum ) return 0;

        int s = (target + sum) / 2;
        if(s < 0) return 0;

        int [] dp = new int[s + 1];
        dp[0] = 1;
        for(int num: nums){
            for (int j = s; j >= num; j--){
                dp[j] += dp[j - num];
            }