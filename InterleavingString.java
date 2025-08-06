//------------Interleaving String----------------------
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        //length must be add up
        if (m+n!= s3.length()) return false;
        //DP table
        boolean[][] dp = new boolean [m+1][n+1];
        dp[0][0]= true;
        //Fill first row (s1 is empty)
        for (int j =1; j<=n; j++){
            dp[0][j]= dp[0][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
        }