//--------------Smallest missing non negative integer--------------
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        Map<Integer, Integer> remainderCount = new HashMap<>();
        for(int num : nums){
            int rem = ((num % value) + value) % value;
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) +1);
        }
        int mex = 0;
        while(true){
            int rem = mex % value;
            if(remainderCount.getOrDefault(rem, 0) > 0){
                remainderCount.put(rem, remainderCount.get(rem) -1);
                mex++;
            }else{