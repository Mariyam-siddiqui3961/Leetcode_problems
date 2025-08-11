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
        // Step 2: Sort in non-decreasing order
        Collections.sort(powers);
        
        // Step 3: Answer each query directly
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            long prod = 1;
            for (int j = l; j <= r; j++) {
                prod = (prod * powers.get(j)) % MOD;
            }
            ans[i] = (int) prod;
        }
        
        return ans;

    }
}