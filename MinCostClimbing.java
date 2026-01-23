//--------------Min cost of climibing stairs------------------
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;        
        int [] dp = new int [n];
        dp[0] = cost[0];
        dp[1] = cost[1];