//-----------------Max dot product of two subsequences------------------
class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[][] dp = new int[n + 1][m + 1];

        // Initialize with very small values
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
            for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                int product = nums1[i - 1] * nums2[j - 1];

                // Option 1: take both elements
                int takeBoth = product;
                if (dp[i - 1][j - 1] != Integer.MIN_VALUE) {
                    takeBoth = Math.max(takeBoth,
                            product + dp[i - 1][j - 1]);
                }
        }
