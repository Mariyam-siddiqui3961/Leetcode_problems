//-------------Max Consecutive ones-----------------------
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for(int i=0; i<nums.length; i++){