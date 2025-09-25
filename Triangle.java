//-------------------Traingle-------------------
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for(int i = 0; i<n; i++){
            dp[i] = triangle.get(n-1).get(i);