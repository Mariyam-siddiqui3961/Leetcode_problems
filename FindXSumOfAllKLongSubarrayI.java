//----find x-sum of all k-long subarray I------------
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int start = 0; start <= n - k; start++) {