//---------Make array element to zero-----------------
class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int total = 0;
        int totalSum = 0;
        for(int v : nums) totalSum += v;
        if(totalSum == 0){
            int zeros = 0;
            for (int v: nums) if(v == 0) zeros++;
            return zeros *2;
        }
        long limit = (long) totalSum * (n+1) +n + 10L;
        for(int i = 0; i<n; i++){
            if(nums[i] !=0)continue;
