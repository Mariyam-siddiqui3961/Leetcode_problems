//----------------Maximum Total Damage------------------
class Solution {
    public long maximumTotalDamage(int[] power) {
           // Sum total damage per unique value
        Map<Integer, Long> sumMap = new HashMap<>();
        for (int p : power) {
            sumMap.put(p, sumMap.getOrDefault(p, 0L) + (long)p);
        }
        // Sort unique damage values
        int n = sumMap.size();
        int[] keys = new int[n];
        int idx = 0;
        for (int k : sumMap.keySet()) keys[idx++] = k;
        Arrays.sort(keys);

        long[] sums = new long[n];
        for (int i = 0; i < n; i++) sums[i] = sumMap.get(keys[i]);

        long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
             // Find largest j < i such that keys[j] < keys[i] - 2
            // Use binary search to get insertion point for (keys[i] - 2) in range [0, i)
            int cutoff = keys[i] - 2;
            int pos = Arrays.binarySearch(keys, 0, i, cutoff);
            int insertionPoint = (pos >= 0) ? pos : -pos - 1;
            int j = insertionPoint - 1; // rightmost index with keys[j] < cutoff

            long take = sums[i] + (j >= 0 ? dp[j] : 0L);
            long skip = (i > 0 ? dp[i - 1] : 0L);
            dp[i] = Math.max(skip, take);
        }

        return dp[n - 1];
    }