//-----------Adjacent Increasing Subarray II--------------
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int ans = 0;
        int prev = 0, curr=1;