//-------------the teo sneaky numbers of digitville---------------
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        int[] result = new int[2];
        int idx=0;