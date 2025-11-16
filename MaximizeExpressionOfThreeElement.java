//------------Maximize the expression of three element---------------
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = Integer.MIN_VALUE;

        int max2 = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;

        for(int x : nums){