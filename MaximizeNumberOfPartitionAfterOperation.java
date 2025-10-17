//---------Maximize number of Partition after operation--------------------
class Solution {
    public int maxPartitionsAfterOperations(String s, int k) {
        Map<Long, Integer> mem = new HashMap<>();
        // dp(0, true, 0) returns number of extra partitions from index 0,
        // +1 accounts for the first partition counted at the end.
        return dp(s, 0, true, 0, k, mem) + 1;
    }