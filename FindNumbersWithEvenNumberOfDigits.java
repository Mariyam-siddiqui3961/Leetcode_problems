//----------find numbers with even number of digits--------------
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int even = 0;
        for(int i = 0; i<nums.length; i++){
            count = 0;
            while(nums[i] > 0){
                nums[i] = nums[i]/10;