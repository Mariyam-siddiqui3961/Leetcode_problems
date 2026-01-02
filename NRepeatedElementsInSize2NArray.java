//-------------------N repeated elements in size 2n array-------------------
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){