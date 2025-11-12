//-----------------Minimum nmber of operation to amke element 1-----------------
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        //count 1
        int count1 =0;
        for(int x : nums) if (x == 1) count1++;
         // if already have one we only need(n - count 1)
        if(count1 > 0) return n- count1;

        //find shortest subarray with gcd = 1
        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            int gcd = nums[i];
