//---------------final element after subarray deletion----------------
class Solution {
    public int finalElement(int[] nums) {
        int n = nums.length;
        if(n ==0)return nums[0];

        return Math.max(nums[0], nums[n-1]);

    }
}