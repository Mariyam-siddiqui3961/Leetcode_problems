//------------maximum freq of an element operation II -----------------------
class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Long, Integer> count = new HashMap<>();
        Map<Long, Integer> diff = new HashMap<>();
         for(int num : nums){
            long x = (long) num;
            count.put(x, count.getOrDefault(x,0) +1);
            diff.put(x-k, diff.getOrDefault(x-k, 0) +1);
            diff.put(x+k+1, diff.getOrDefault(x+k+1, 0) -1);
        }