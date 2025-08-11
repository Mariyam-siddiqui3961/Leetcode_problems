//-------------Range of Product Queries of java-------------------------
class Solution {
    public int[] productQueries(int n, int[][] queries) {
         final int MOD = 1_000_000_007;
        // Step 1: Extract powers of 2 from n
        List<Integer> powers = new ArrayList<>();
        int bit = 0;
        int temp = n;
        while (temp > 0) {
            if ((temp & 1) == 1) {
                powers.add(1 << bit);
            }
            bit++;
            temp >>= 1;
        }