//---------Make array element to zero-----------------
class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int total = 0;
        int totalSum = 0;
        for(int v : nums) totalSum += v;
