//---------Maximize number of Partition after operation--------------------
class Solution {
    public int maxPartitionsAfterOperations(String s, int k) {
        Map<Long, Integer> mem = new HashMap<>();
        // dp(0, true, 0) returns number of extra partitions from index 0,
        // +1 accounts for the first partition counted at the end.
        return dp(s, 0, true, 0, k, mem) + 1;
    }
    
    // dp: maximum number of partitions of s[i..n),
    // canChange - whether we still can change one char,
    // mask - bitmask of chars present in the current (ongoing) partition.
    private int dp(String s, int i, boolean canChange, int mask, int k, Map<Long, Integer> mem) {
        int n = s.length();
        if (i == n) return 0;

        // pack key: i (shift), canChange (1 bit), mask (26 bits)
        long key = ((long)i << 27) | ((canChange ? 1L : 0L) << 26) | (mask & ((1 << 26) - 1));
        if (mem.containsKey(key)) return mem.get(key);
         int res = 0;
        // Option 1: use the original character
        int bit = 1 << (s.charAt(i) - 'a');
        res = Math.max(res, applyChoice(s, i, canChange, mask, bit, k, mem));

        // Option 2: if allowed, try changing this char to any other letter (or same letter - harmless)
        if (canChange) {
            for (int c = 0; c < 26; ++c) {
                int newBit = 1 << c;
                res = Math.max(res, applyChoice(s, i, false, mask, newBit, k, mem));
            }
        }