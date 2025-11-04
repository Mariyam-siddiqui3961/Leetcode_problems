//----find x-sum of all k-long subarray I------------
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int start = 0; start <= n - k; start++) {
            // Frequency array since nums[i] <= 50
            int[] freq = new int[51];

            // Count frequency of each number in the current window
            for (int i = start; i < start + k; i++) {
                freq[nums[i]]++;
            }

            // Create a list of (value, frequency)