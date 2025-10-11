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