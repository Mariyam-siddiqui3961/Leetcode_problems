//---------Climbing Stairs--------------------
// class Solution {
//     public int climbStairs(int n) {
//         if (n <= 2) return n;

//         int a = 1; // ways to reach step 1
//         int b = 2; // ways to reach step 2

//         for (int i = 3; i <= n; i++) {
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//         return b;
//     }
// }





class Solution {
    public int climbStairs(int n) {

        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
