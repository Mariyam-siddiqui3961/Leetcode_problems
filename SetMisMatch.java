//-------------Set Mismatch----------------------
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        int sum = 0;