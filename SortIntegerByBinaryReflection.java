//---------------sort integer by binery reflection-------------
class Solution {
    public int[] sortByReflection(int[] nums) {
        int [][] arr = new int [nums.length][2];

        for(int i = 0; i< nums.length; i++){
            int num = nums[i];©leetcode