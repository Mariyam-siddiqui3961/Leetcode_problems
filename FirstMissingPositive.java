//----------------first missing positive------------
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Step 1: Put numbers in correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // swap nums[i] with nums[nums[i]-1]
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;