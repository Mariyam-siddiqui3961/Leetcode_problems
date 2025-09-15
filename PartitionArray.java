//-------------Partition Array according to given pivot------------------
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        for (int num: nums){
            if(num<pivot){