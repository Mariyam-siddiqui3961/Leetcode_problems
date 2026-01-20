//-----------partition equal subset sum ------------
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        if (sum %2 != 0) return false;

        int target = sum/2;