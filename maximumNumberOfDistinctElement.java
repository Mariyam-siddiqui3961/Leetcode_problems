//-------------maximum number of distinct element----------------
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long last = Long.MIN_VALUE;
        int distinct = 0;

        for (int num : nums){
            long low  = (long) num -k;
            long high = (long) num +k;
            long candidate = Math.max(low, last +1);
            if(candidate <= high){
                distinct++;
                last = candidate;
            }
            }
        return distinct;
    }
}