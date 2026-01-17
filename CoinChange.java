//-------------------coin change---------------
class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] dp = new int [amount +1];

        for(int i = 0; i<= amount; i++){
            dp[i] = amount +1;
        }